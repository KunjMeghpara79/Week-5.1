package Day1;

public class NotificationConfig {

    private static final NotificationConfig INSTANCE =
            new NotificationConfig();

    private final String emailServer;
    private final String smsProvider;
    private final String pushProvider;

    private NotificationConfig() {
        emailServer = "smtp.gmail.com";
        smsProvider = "Twilio";
        pushProvider = "Firebase";
    }

    public static NotificationConfig getInstance() {
        return INSTANCE;
    }

    public String getEmailServer() {
        return emailServer;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    public String getPushProvider() {
        return pushProvider;
    }
}

/*
* in spring boot when it creates a bean on starting of application and if we inject an object of that bean then we will receive the same instance.
* Spring manages the object's lifecycle and dependency injection for you.
*/
