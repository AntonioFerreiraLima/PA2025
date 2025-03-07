package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        PaymentProcessor processor = new PaymentProcessor();

        while (true) {
            System.out.println("\n=== Sistema de Pagamentos ===");
            System.out.println("1: Pix");
            System.out.println("2: Cartão de Crédito");
            System.out.println("3: Boleto");
            System.out.println("0: Sair");
            System.out.print("Escolha o método de pagamento: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            try {
                System.out.print("Digite o valor da transação: R$");
                double amount = Double.parseDouble(scanner.nextLine());

                switch (choice) {
                    case "1":
                        processor.setPaymentStrategy(new PixPayment());
                        break;
                    case "2":
                        processor.setPaymentStrategy(new CreditCardPayment());
                        break;
                    case "3":
                        processor.setPaymentStrategy(new BoletoPayment());
                        break;
                    default:
                        throw new IllegalArgumentException("Método de pagamento inválido!");
                }

                processor.process(amount);

            } catch (NumberFormatException e) {
                System.out.println("Erro: Valor inválido!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}