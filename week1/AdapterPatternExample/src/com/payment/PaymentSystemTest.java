package com.payment;

import com.payment.adapters.*;
import com.payment.gateways.*;
import com.payment.processor.PaymentProcessor;

public class PaymentSystemTest {
    public static void main(String[] args) {
        // Create gateway instances
        PayPalGateway payPal = new PayPalGateway();
        StripeGateway stripe = new StripeGateway();
        
        // Create adapters
        PaymentProcessor payPalAdapter = new PayPalAdapter(payPal);
        PaymentProcessor stripeAdapter = new StripeAdapter(stripe);
        
        
        System.out.println("=== PayPal Payment ===");
        payPalAdapter.processPayment(100.50);
        payPalAdapter.verifyTransaction("PAYPAL-12345");
        
      
        System.out.println("\n=== Stripe Payment ===");
        stripeAdapter.processPayment(75.25);
        stripeAdapter.verifyTransaction("STRIPE-67890");
    }
}