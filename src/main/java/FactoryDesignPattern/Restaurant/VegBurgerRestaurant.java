package FactoryDesignPattern.Restaurant;

import FactoryDesignPattern.Burger.Burger;
import FactoryDesignPattern.Burger.VegBurger;

public class VegBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        Burger vegBurger = new VegBurger();
        vegBurger.prepare();

        return vegBurger;
    }
}
