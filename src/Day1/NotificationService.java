package Day1;

public class NotificationService {

    public void sendNotification(String channel, String message) {
        Notifier notifier = NotifierFactory.createNotifier(channel);
        notifier.send( message);
    }
}