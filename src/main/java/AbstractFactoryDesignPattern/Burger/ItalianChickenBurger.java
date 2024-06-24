package AbstractFactoryDesignPattern.Burger;

public class ItalianChickenBurger implements ChickenBurger{
    @Override
    public void prepare() {
        System.out.println("Italian Chicken Burger loading..");
    }
}
