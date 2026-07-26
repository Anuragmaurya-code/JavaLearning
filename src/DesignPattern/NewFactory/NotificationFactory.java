package DesignPattern.NewFactory;

public class NotificationFactory {

    public static void sendNotification(String type){
        if(type=="Email"){
            Notification emailNotification=new EmailNotification();
            emailNotification.send();
        }else{
            Notification smsNotification=new SMSNotification();
            smsNotification.send();
        }
    }
}
