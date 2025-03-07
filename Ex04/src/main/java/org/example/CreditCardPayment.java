package org.example;

class CreditCardPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite o número do cartão: ");
        String cardNumber = scanner.nextLine();
        System.out.println("Pagamento de R$" + amount + " via Cartão de Crédito (" + cardNumber + ")");
        System.out.println("Pagamento processado com sucesso!");
    }
}
