package Day1;

public class Day1 {

    public static void main(String[] args) {

        NotificationService service =
                new NotificationService();

        service.sendNotification("email", "This is message 1");

        service.sendNotification("sms", "This is message 2");

        service.sendNotification("push", "This is message 3");
    }
}