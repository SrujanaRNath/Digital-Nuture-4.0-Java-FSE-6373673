package com.example.service;

public class PaymentService {
    private final PaymentGateway gateway;

    public PaymentService(PaymentGateway gateway) {
        this.gateway = gateway;
    }

    public void processPayment(String userId, double amount) {
        gateway.charge(userId, amount);
    }
}

interface PaymentGateway {
    void charge(String userId, double amount);
}
