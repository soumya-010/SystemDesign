package AbstractFactoryDesignPattern.Burger;

public class MexicanChickenBurger implements ChickenBurger{
    @Override
    public void prepare() {
        System.out.println("Mexican Chicken Burger loading..");
    }
}
