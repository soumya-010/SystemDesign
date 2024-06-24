package AbstractFactoryDesignPattern.Burger;

public class ItalianVegBurger implements VegBurger{

    @Override
    public void prepare() {
        System.out.println("Italian Veg Burger loading..");
    }
}
