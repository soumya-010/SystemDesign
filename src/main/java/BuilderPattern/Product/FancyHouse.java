package BuilderPattern.Product;

public class FancyHouse extends House {
    Boolean isPool;
    int numGarage;

    public FancyHouse(int numDoors, int numWindows, int numFloors, int areaSqFt, Boolean isPool, int numGarage) {
        this.numDoors = numDoors;
        this.numWindows = numWindows;
        this.numFloors = numFloors;
        this.areaSqFt = areaSqFt;
        this.isPool = isPool;
        this.numGarage = numGarage;
    }

    @Override
    public void display() {
        System.out.println("Display :: Fancy House, numDoors = " + this.numDoors + " setNumWindows = " + this.numWindows + " setNumFloors = " + this.numFloors + " setAreaSqFt = " + this.areaSqFt + " isPool = " + this.isPool + " numGarage = "+ this.numGarage);
    }
}
