package org.example;

class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX" + (int)(Math.random() * 1000000);
        System.out.println("Pagamento de R$" + amount + " via Pix. Código: " + pixCode);
        System.out.println("Pagamento processado com sucesso!");
    }
}
