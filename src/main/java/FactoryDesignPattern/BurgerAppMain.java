package FactoryDesignPattern;
import FactoryDesignPattern.Burger.Burger;
import FactoryDesignPattern.Restaurant.ChickenBurgerRestaurant;
import FactoryDesignPattern.Restaurant.Restaurant;
import FactoryDesignPattern.Restaurant.VegBurgerRestaurant;

public class BurgerAppMain {
    public static void main (String[] args) {

        Restaurant vegBurgerRestaurant = new VegBurgerRestaurant();
        Burger vegBurger = vegBurgerRestaurant.orderBurger();

        Restaurant chickenBurgerRestaurant = new ChickenBurgerRestaurant();
        Burger chickenBurger = chickenBurgerRestaurant.orderBurger();
    }
}
