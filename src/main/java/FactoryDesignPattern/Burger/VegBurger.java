package FactoryDesignPattern.Burger;

public class VegBurger implements Burger {
    String productID;

    @Override
    public void prepare() {
        System.out.println("Preparing VegBurger");
    }
}
