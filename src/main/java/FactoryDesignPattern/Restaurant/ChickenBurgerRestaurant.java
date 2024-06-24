package FactoryDesignPattern.Restaurant;

import FactoryDesignPattern.Burger.Burger;
import FactoryDesignPattern.Burger.ChickenBurger;

public class ChickenBurgerRestaurant extends Restaurant {

    @Override
    public Burger createBurger() {
        Burger chickenBurger = new ChickenBurger();
        chickenBurger.prepare();

        return chickenBurger;
    }
}
