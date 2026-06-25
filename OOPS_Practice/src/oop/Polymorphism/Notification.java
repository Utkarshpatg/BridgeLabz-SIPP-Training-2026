package oop.Polymorphism;

public class Notification {
    // Instance variables
    String recipientName;
    String message;

    // Constructor
    Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    // Method to be overridden
    public void sendNotification() {
        System.out.println("Sending Notification...");
    }
}
