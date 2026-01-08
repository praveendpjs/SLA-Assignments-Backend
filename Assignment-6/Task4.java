class Notification{
    void send(){
        System.out.println("Notification has been sent");
    }
}
class EmailNotification extends Notification{
    void send(){
        System.out.println("Notification has been sent through email");
    }
}

class SMSNotification  extends Notification{
    void send(){
        System.out.println("Notification has been sent through SMS");
    }
}
public class Task4 {
    public static void main(String[] args) {
        EmailNotification email = new EmailNotification();
        email.send();

        SMSNotification sms = new SMSNotification();
        sms.send();

        Notification notification = new Notification();
        notification.send();
    }
}
