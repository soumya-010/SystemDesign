package BuilderPattern;

import BuilderPattern.Builder.FancyHouseBuilder;
import BuilderPattern.Builder.SimpleHouseBuilder;
import BuilderPattern.Product.FancyHouse;
import BuilderPattern.Product.House;
import BuilderPattern.Product.SimpleHouse;

public class HousingAppMain {
    public static void main (String[] args) {
        HouseDirector director =  new HouseDirector();

        SimpleHouseBuilder simpleHouseBuilder = new SimpleHouseBuilder();
        director.makeSimpleHouse(simpleHouseBuilder); // Primary Step before Object Creation
        simpleHouseBuilder.setIsPool(false); // Secondary step before Object Creation
        House simpleHouse = simpleHouseBuilder.build();
        simpleHouse.display();


        FancyHouseBuilder fancyHouseBuilder = new FancyHouseBuilder();
        director.makeFancyHouse(fancyHouseBuilder);
        House fancyHouse = fancyHouseBuilder.build();
        fancyHouse.display();
    }
}
