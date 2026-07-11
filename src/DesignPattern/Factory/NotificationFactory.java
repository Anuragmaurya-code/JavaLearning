package DesignPattern.Factory;

public class NotificationFactory {
    public static Notification sendNotification(String type){
        switch (type){
            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
        }
        throw new IllegalArgumentException("Invalid Type");


    }
}
