package org.example;

class PaymentProcessor {
    private PaymentStrategy paymentStrategy;


    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }


    public void process(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Método de pagamento não selecionado!");
        }
        paymentStrategy.processPayment(amount);
    }
}