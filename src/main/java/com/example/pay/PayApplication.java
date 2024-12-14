package com.example.pay;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PayApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(OrderService orderService) {
        return args -> {
            orderService.placeOrder(100.0);  // Запуск метода placeOrder для тестирования
        };
    }
}
