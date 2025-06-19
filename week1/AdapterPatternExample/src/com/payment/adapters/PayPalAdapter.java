package com.payment.adapters;

import com.payment.gateways.PayPalGateway;
import com.payment.processor.PaymentProcessor;

public class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPal;
    
    public PayPalAdapter(PayPalGateway payPal) {
        this.payPal = payPal;
    }
    
    @Override
    public void processPayment(double amount) {
        payPal.sendPayment(amount);
    }
    
    @Override
    public boolean verifyTransaction(String transactionId) {
        return payPal.checkPaymentStatus(transactionId);
    }
}