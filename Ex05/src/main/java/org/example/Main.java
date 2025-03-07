package org.example;

class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistema de Notificações ===");
            System.out.println("1: Email");
            System.out.println("2: SMS");
            System.out.println("3: Push Notification");
            System.out.println("0: Sair");
            System.out.print("Escolha o tipo de notificação: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Encerrando o sistema...");
                break;
            }

            try {
                System.out.print("Digite a mensagem a ser enviada: ");
                String message = scanner.nextLine();

                Notification notification = NotificationFactory.createNotification(choice);

                notification.send(message);

            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        scanner.close();
    }
}