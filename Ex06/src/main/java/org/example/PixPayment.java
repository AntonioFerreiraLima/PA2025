package org.example;
import java.util.Random;

public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String pixCode = "PIX-" + new Random().nextInt(1000000);
        System.out.println("Pagamento de R$" + String.format("%.2f", amount) + " via Pix.");
        System.out.println("Código Pix gerado: " + pixCode);
        System.out.println("Transação concluída com sucesso!");
    }
}
