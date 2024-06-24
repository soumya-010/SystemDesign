package FactoryDesignPattern.Burger;

public class ChickenBurger implements Burger {
    String productID;

    @Override
    public void prepare() {
        System.out.println("Preparing ChickenBurger");
    }
}
