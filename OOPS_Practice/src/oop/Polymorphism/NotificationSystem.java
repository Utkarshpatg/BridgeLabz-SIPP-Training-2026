package oop.Polymorphism;

public class NotificationSystem {
    public static void main(String[] args) {

        // Polymorphism
        Notification[] notifications = new Notification[3];

        notifications[0] = new EmailNotification(
                "Ravi",
                "Your order has been shipped.");

        notifications[1] = new SMSNotification(
                "Aman",
                "OTP is 456789.");

        notifications[2] = new PushNotification(
                "Priya",
                "New offer available!");

        System.out.println("===== Sent Notifications =====\n");

        // Dynamic Method Dispatch
        for (Notification notification : notifications) {
            notification.sendNotification();
        }
    }
}
