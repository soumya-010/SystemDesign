package AbstractFactoryDesignPattern.AbstractRestaurentFactory;

import AbstractFactoryDesignPattern.Burger.*;

public class MexicanRestaurant implements AbstractRestaurantFactory{
    @Override
    public VegBurger orderVegBurger() {
        VegBurger vegBurger = new MexicanVegBurger();
        return vegBurger;
    }

    @Override
    public ChickenBurger orderChickenBurger() {
        ChickenBurger chickenBurger = new MexicanChickenBurger();
        return chickenBurger;
    }
}
