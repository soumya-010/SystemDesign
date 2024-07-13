package Decorator.NotificationApp.Client;

import Decorator.NotificationApp.Components.EmailNotifier;
import Decorator.NotificationApp.Components.Notifier;
import Decorator.NotificationApp.Decorators.FacebookNotifier;
import Decorator.NotificationApp.Decorators.SMSNotifier;

public class NotificationApp {
    public static void main (String[] args) {
        Notifier newNotifier = new EmailNotifier();
        newNotifier = new FacebookNotifier(newNotifier);
        newNotifier = new SMSNotifier(newNotifier);

        newNotifier.notify("New Alert! 50% Off for 2 days!");
    }
}
