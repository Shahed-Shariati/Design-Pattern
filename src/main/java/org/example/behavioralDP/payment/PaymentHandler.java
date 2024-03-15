package org.example.behavioralDP.payment;

public abstract class PaymentHandler {
    private PaymentHandler nextPaymentHandler;

    public void setNextPaymentHandler(PaymentHandler nextPaymentHandler) {
        this.nextPaymentHandler = nextPaymentHandler;
    }

    public void process(Long amount){
        if(this.nextPaymentHandler != null){
            this.nextPaymentHandler.process(amount);
        }else {
            System.out.println("Request can not be process for amount " + amount);
        }
    }
}
