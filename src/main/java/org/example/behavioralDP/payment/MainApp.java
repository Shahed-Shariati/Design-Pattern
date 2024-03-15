package org.example.behavioralDP.payment;

public class MainApp {
    public static void main(String[] args) {
        PaymentHandler payment = getPayment();
        payment.process(20_000l);
        payment.process(70_000l);
        payment.process(2000_000l);
        payment.process(75_000_000l);
        payment.process(150_000_000l);
    }

    private static PaymentHandler getPayment() {
        PaymentHandler cash = new Cash();
        PaymentHandler card = new Card();
        PaymentHandler check = new Check();
        cash.setNextPaymentHandler(card);
        card.setNextPaymentHandler(check);

        return cash;
    }
}
