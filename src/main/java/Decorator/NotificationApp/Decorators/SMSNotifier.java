package Decorator.NotificationApp.Decorators;

import Decorator.NotificationApp.Components.Notifier;

public class SMSNotifier implements BaseDecorator{
    Notifier wrappee;
    public SMSNotifier(Notifier wrappee) {
        this.wrappee = wrappee;
    }
    @Override
    public void notify(String message) {
        wrappee.notify(message);
        System.out.println("Notifying via Facebook: " + message);
    }
}
