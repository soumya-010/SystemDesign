package AbstractFactoryDesignPattern.AbstractRestaurentFactory;

import AbstractFactoryDesignPattern.Burger.ChickenBurger;
import AbstractFactoryDesignPattern.Burger.ItalianChickenBurger;
import AbstractFactoryDesignPattern.Burger.ItalianVegBurger;
import AbstractFactoryDesignPattern.Burger.VegBurger;

public class ItalianRestaurant implements AbstractRestaurantFactory{
    @Override
    public VegBurger orderVegBurger() {
        VegBurger vegBurger = new ItalianVegBurger();
        return vegBurger;
    }

    @Override
    public ChickenBurger orderChickenBurger() {
        ChickenBurger chickenBurger = new ItalianChickenBurger();
        return chickenBurger;
    }
}
