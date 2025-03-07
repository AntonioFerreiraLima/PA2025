package org.example;

public class PaymentFactory {
    public static PaymentStrategy createPaymentStrategy(int choice) {
        switch (choice) {
            case 1:
                return new PixPayment();
            case 2:
                return new CreditCardPayment();
            case 3:
                return new BoletoPayment();
            default:
                throw new IllegalArgumentException("Método de pagamento inválido!");
        }
    }
}