package DesignPattern.Factory;

public class OrderService {
    public static void main(String[] args) {
        Notification notification=NotificationFactory.sendNotification("EMAIL");
        notification.send();
    }


}
