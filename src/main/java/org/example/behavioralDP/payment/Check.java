package org.example.behavioralDP.payment;

public class Check extends PaymentHandler{
    @Override
    public void process(Long amount) {
        if (amount <= 100_000_000) {
            System.out.println("Payment process of " + amount + "T by check handler");
        }else {
            super.process(amount);
        }
    }
}
