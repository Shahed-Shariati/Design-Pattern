package org.example.behavioralDP.payment;

public class Card extends PaymentHandler{

    @Override
    public void process(Long amount) {
        if (amount <= 10_000_000 ) {
            System.out.println("Payment process of " + amount + "T by Card handler");
        } else {
            super.process(amount);
        }
    }
}
