package org.example;

public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void process(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Nenhum método de pagamento selecionado!");
        }
        paymentStrategy.processPayment(amount);
    }
}