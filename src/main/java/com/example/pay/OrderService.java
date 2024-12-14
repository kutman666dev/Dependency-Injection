package com.example.pay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentService paymentService;  // Основной сервис (например, кредитная карта)
    private PaymentService additionalPaymentService;  // Дополнительный сервис (например, PayPal)

    @Autowired
    public OrderService(@Qualifier("creditCardPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @Autowired
    public void setAdditionalPaymentService(@Qualifier("paypalPaymentService") PaymentService additionalPaymentService) {
        this.additionalPaymentService = additionalPaymentService;
    }

    public void placeOrder(double amount) {
        paymentService.processPayment(amount);  // Вызов основного сервиса
        additionalPaymentService.processPayment(amount);  // Вызов дополнительного сервиса
    }
}
