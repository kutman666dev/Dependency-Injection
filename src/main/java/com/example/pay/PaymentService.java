package com.example.pay;

public interface PaymentService {
    void processPayment(double amount);
    String getPaymentInfo();  // Добавьте этот метод для обоих сервисов
}
