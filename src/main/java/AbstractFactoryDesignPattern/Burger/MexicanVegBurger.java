package AbstractFactoryDesignPattern.Burger;

public class MexicanVegBurger implements VegBurger{
    @Override
    public void prepare() {
        System.out.println("Mexican Veg Burger loading..");
    }
}
