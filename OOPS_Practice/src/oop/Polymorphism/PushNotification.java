package oop.Polymorphism;

public class PushNotification extends Notification{
    PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification");
        System.out.println("Recipient : " + recipientName);
        System.out.println("Message   : " + message);
        System.out.println("----------------------------");
    }
}
