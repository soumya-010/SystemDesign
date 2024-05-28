import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Observable;

interface IObservable {
    void add(IObserver observer);
    void remove(IObserver observer);
    void notifyAllObservers();

    public void getState();
    public void setState();

    // This is not part of the interface but is required because we are using IObserver.getObservableID() later
    String getObservableID();

}

interface IObserver {
    public String getObserverID();
    public void update();
}


class ConcreteObservable implements IObservable {
    String ObservableID;
    List<IObserver> observers = new ArrayList<IObserver>();

    ConcreteObservable(String ObservableID) {
        this.ObservableID = ObservableID;
    };

    public String getObservableID() {
        return ObservableID;
    };

    @Override
    public void add(IObserver observer) {
        observers.add(observer);
        System.out.println("Observer "+ observer.getObserverID() + " added");
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
        System.out.println("Observer "+ observer.getObserverID() + " removed");
    }

    @Override
    public void notifyAllObservers() {
        for(IObserver  observer : observers) {
            observer.update();
        }
    }

    @Override
    public void getState() {
        System.out.println("Getting state for " + this.getObservableID());
    };

    @Override
    public void setState() {
        System.out.println("Setting new state for " + this.getObservableID());
    };
}

class ConcreteObserver implements IObserver {
    String obsID;
    ConcreteObservable observable;
    public ConcreteObserver(String obsID, ConcreteObservable observable) {
        this.obsID = obsID;
        this.observable = observable;
    }

    public String getObserverID() {
        return obsID;
    }
    @Override
    public void update() {
        System.out.println("Observer with ID: "+ this.obsID + " and referring to Observable " +  observable.getObservableID() +  " is updated");
    }
}

public class ObserverPattern {
    public static void main(String args[])
    {
        ConcreteObservable Uber = new ConcreteObservable("Uber");
        ConcreteObserver user1 = new ConcreteObserver("sen.soumya", Uber);
        ConcreteObserver user2 = new ConcreteObserver("barca.fanboy", Uber);
        ConcreteObserver user3 = new ConcreteObserver("inzam.hussain", Uber);
        Uber.add(user1);
        Uber.add(user2);
        Uber.add(user3);
        Uber.setState();
        Uber.notifyAllObservers();
        Uber.remove(user3);
        Uber.notifyAllObservers();
    }
}

