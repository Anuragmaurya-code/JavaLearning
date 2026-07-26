package DesignPattern.NewFactory;

public class SMSNotification implements Notification{
    @Override
    public void send() {
        System.out.println("SMS sended");
    }
}
