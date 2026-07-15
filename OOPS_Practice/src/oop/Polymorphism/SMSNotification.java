package oop.Polymorphism;

public class SMSNotification extends Notification{
    SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS Notification");
        System.out.println("Recipient : " + recipientName);
        System.out.println("Message   : " + message);
        System.out.println("----------------------------");
    }
}
