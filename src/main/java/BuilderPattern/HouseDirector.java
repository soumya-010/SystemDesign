package BuilderPattern;
import BuilderPattern.Builder.HouseBuilder;
import BuilderPattern.Product.FancyHouse;
import BuilderPattern.Product.House;
import BuilderPattern.Product.SimpleHouse;

public class HouseDirector {
    public void makeSimpleHouse(HouseBuilder simpleHouseBuilder) {
        simpleHouseBuilder.setNumDoors(1);
        simpleHouseBuilder.setNumWindows(2);
        simpleHouseBuilder.setNumFloors(1);
        simpleHouseBuilder.setAreaSqFt(1000);
        //simpleHouseBuilder.setIsPool(false); --> Will be handled later, Builder Pattern ensures this will work
        simpleHouseBuilder.setNumGarage(1);

        //simpleHouseBuilder.build();
    }

    public void makeFancyHouse(HouseBuilder fancyHouseBuilder) {
        fancyHouseBuilder.setNumDoors(3);
        fancyHouseBuilder.setNumWindows(12);
        fancyHouseBuilder.setNumFloors(3);
        fancyHouseBuilder.setAreaSqFt(2500);
        fancyHouseBuilder.setIsPool(true);
        fancyHouseBuilder.setNumGarage(3);

        //fancyHouseBuilder.build();
    }
}
