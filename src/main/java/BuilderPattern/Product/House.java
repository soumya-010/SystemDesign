package BuilderPattern.Product;

public abstract class House {
    int numDoors;
    int numWindows;
    int numFloors;
    int areaSqFt;
    Boolean isPool;
    int numGarage;

    public abstract void display();
}
