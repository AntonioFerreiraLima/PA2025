package org.example;

class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type.toLowerCase()) {
            case "email":
            case "1":
                return new EmailNotification();
            case "sms":
            case "2":
                return new SMSNotification();
            case "push":
            case "3":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido: " + type);
        }
    }
}
