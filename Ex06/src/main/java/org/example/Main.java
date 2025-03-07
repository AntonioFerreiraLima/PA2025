package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentProcessor processor = new PaymentProcessor();

        while (true) {
            System.out.println("\n=== Sistema de Pagamentos ===");
            System.out.println("1: Pix");
            System.out.println("2: Cartão de Crédito");
            System.out.println("3: Boleto");
            System.out.println("0: Sair");
            System.out.print("Escolha o método de pagamento: ");

            try {
                int choice = Integer.parseInt(scanner.nextLine());

                if (choice == 0) {
                    System.out.println("Encerrando o sistema...");
                    break;
                }

                System.out.print("Digite o valor da transação: R$");
                double amount = Double.parseDouble(scanner.nextLine());

                if (amount <= 0) {
                    System.out.println("Erro: O valor deve ser maior que zero!");
                    continue;
                }

                PaymentStrategy strategy = PaymentFactory.createPaymentStrategy(choice);
                processor.setPaymentStrategy(strategy);
                processor.process(amount);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor inválido!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
        scanner.close();
    }
}