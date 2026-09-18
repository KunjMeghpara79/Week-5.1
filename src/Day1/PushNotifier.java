package Day1;

public class PushNotifier implements Notifier{
    @Override
    public void send(String message) {
        System.out.println("Push Notification Provider "+NotificationConfig.getInstance().getPushProvider());
        System.out.println("Push Notification " + message);
    }
}
