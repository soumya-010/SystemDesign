package BuilderPattern.Builder;
import BuilderPattern.Product.House;
import BuilderPattern.Product.SimpleHouse;

public class SimpleHouseBuilder implements HouseBuilder{
    int numDoors;
    int numWindows;
    int numFloors;
    int areaSqFt;
    Boolean isPool;
    int numGarage;

    @Override
    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    @Override
    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    @Override
    public void setAreaSqFt(int areaSqFt) {
        this.areaSqFt = areaSqFt;
    }

    @Override
    public void setIsPool(Boolean isPool) {
        this.isPool = isPool;
    }

    @Override
    public void setNumGarage(int numGarage) {
        this.numGarage = numGarage;
    }
    public House build() {
        return new SimpleHouse(numDoors, numWindows, numFloors, areaSqFt, isPool, numGarage);
    }
}
