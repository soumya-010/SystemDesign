package BuilderPattern.Builder;

import BuilderPattern.Product.House;

public interface HouseBuilder {
    public void setNumDoors(int numDoors);
    public void setNumWindows(int numWindows);
    public void setNumFloors(int numFloors);
    public void setAreaSqFt(int areaSqFt);

    public void setIsPool(Boolean isPool);
    public void setNumGarage(int numGarage);

    public House build();
}
