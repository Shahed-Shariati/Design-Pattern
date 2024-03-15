package org.example.behavioralDP.payment;

public class Cash extends PaymentHandler{
    @Override
    public void process(Long amount) {
        if(amount <= 50_000){
            System.out.println("Payment process of " + amount + "T by cash handler");
        }else {
            super.process(amount);
        }
    }
}
