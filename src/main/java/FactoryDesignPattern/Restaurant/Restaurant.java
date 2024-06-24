package FactoryDesignPattern.Restaurant;
import FactoryDesignPattern.Burger.Burger;

public abstract class Restaurant {
    public Burger orderBurger() {
        Burger burger = createBurger();
        return burger;
    }

    public abstract Burger createBurger();
}