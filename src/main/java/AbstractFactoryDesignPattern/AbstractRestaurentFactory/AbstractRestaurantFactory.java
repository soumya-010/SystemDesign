package AbstractFactoryDesignPattern.AbstractRestaurentFactory;

import AbstractFactoryDesignPattern.Burger.ChickenBurger;
import AbstractFactoryDesignPattern.Burger.VegBurger;

public interface AbstractRestaurantFactory {
    public VegBurger orderVegBurger();
    public ChickenBurger orderChickenBurger();
}
