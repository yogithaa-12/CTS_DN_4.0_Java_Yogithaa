package com.payment.gateways;

public class PayPalGateway {
    public void sendPayment(double amount) {
        System.out.println("Processing PayPal payment: $" + amount);
    }
    
    public boolean checkPaymentStatus(String transactionId) {
        System.out.println("Verifying PayPal transaction: " + transactionId);
        return true;
    }
}