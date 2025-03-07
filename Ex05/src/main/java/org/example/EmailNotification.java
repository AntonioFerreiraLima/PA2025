package org.example;

class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("Enviando Email: " + message);
    }
}
