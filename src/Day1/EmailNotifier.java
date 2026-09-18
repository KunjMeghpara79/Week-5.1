package Day1;

public class EmailNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Email Server : "+NotificationConfig.getInstance().getEmailServer());
        System.out.println(message);
    }
}
