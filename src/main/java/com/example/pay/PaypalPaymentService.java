package com.example.pay;

import org.springframework.stereotype.Service;

@Service("paypalPaymentService")
public class PaypalPaymentService implements PaymentService {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }

    @Override
    public String getPaymentInfo() {
        return "Payment via PayPal";
    }
}
