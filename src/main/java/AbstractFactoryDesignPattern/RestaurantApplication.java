package AbstractFactoryDesignPattern;

import AbstractFactoryDesignPattern.AbstractRestaurentFactory.AbstractRestaurantFactory;
import AbstractFactoryDesignPattern.AbstractRestaurentFactory.ItalianRestaurant;
import AbstractFactoryDesignPattern.AbstractRestaurentFactory.MexicanRestaurant;
import AbstractFactoryDesignPattern.Burger.ChickenBurger;
import AbstractFactoryDesignPattern.Burger.VegBurger;

public class RestaurantApplication {
    public static void main(String[] args) {
        AbstractRestaurantFactory italianRestaurantFactory = new ItalianRestaurant();
        VegBurger italianVegBurger = italianRestaurantFactory.orderVegBurger();
        italianVegBurger.prepare();
        ChickenBurger italianChickenBurger = italianRestaurantFactory.orderChickenBurger();
        italianChickenBurger.prepare();


        AbstractRestaurantFactory mexicanRestaurantFactory = new MexicanRestaurant();
        VegBurger  mexicanVegBurger = mexicanRestaurantFactory.orderVegBurger();
        mexicanVegBurger.prepare();
        ChickenBurger  mexicanChickenBurger = mexicanRestaurantFactory.orderChickenBurger();
        mexicanChickenBurger.prepare();
    }
}
