package Decorator.NotificationApp.Components;

public class EmailNotifier implements Notifier{
    @Override
    public void notify(String message) {
        System.out.println("Notifying via Email: " + message);
    }
}
