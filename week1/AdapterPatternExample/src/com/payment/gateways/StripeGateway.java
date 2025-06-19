package com.payment.gateways;

public class StripeGateway {
    public void makeStripePayment(double amount) {
        System.out.println("Processing Stripe payment: $" + amount);
    }
    
    public boolean verifyStripePayment(String paymentId) {
        System.out.println("Verifying Stripe payment: " + paymentId);
        return true;
    }
}