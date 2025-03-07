package org.example;

import java.util.Random;

public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        String boletoCode = "BOL-" + new Random().nextInt(1000000);
        System.out.println("Pagamento de R$" + String.format("%.2f", amount) + " via Boleto.");
        System.out.println("Código do Boleto gerado: " + boletoCode);
        System.out.println("Transação concluída com sucesso!");
    }
}