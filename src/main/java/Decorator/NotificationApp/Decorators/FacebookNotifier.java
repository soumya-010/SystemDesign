package Decorator.NotificationApp.Decorators;

import Decorator.NotificationApp.Components.Notifier;

public class FacebookNotifier implements BaseDecorator{
    Notifier wrappee;
    public FacebookNotifier(Notifier wrappee) {
        this.wrappee = wrappee;
    }
    @Override
    public void notify(String message) {
        wrappee.notify(message);
        System.out.println("Notifying via Facebook: " + message);
    }
}
