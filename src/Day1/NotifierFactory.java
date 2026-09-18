package Day1;

public class NotifierFactory {

    public static Notifier createNotifier(String channel) {

        switch (channel.toLowerCase()) {

            case "email":
                return new EmailNotifier();

            case "sms":
                return new SmsNotifier();

            case "push":
                return new PushNotifier();

            default:
                throw new IllegalArgumentException("Unknown notification channel: " + channel);
        }
    }
}