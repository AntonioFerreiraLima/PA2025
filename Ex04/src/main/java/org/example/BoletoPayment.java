package org.example;

class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOL" + (int)(Math.random() * 100000000);
        System.out.println("Pagamento de R$" + amount + " via Boleto. Código: " + boletoCode);
        System.out.println("Pagamento processado com sucesso!");
    }
}
