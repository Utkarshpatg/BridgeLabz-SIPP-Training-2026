package oop.Polymorphism;

public class EmailNotification extends Notification{
    EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email Notification");
        System.out.println("Recipient : " + recipientName);
        System.out.println("Message   : " + message);
        System.out.println("----------------------------");
    }
}
