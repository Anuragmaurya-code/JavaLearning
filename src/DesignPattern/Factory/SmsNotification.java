package DesignPattern.Factory;

public class SmsNotification implements Notification{
    @Override
    public void send() {
        System.out.println("Sms Sended");
    }
}
