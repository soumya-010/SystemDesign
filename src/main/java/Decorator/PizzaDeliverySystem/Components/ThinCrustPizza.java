package Decorator.PizzaDeliverySystem.Components;

public class ThinCrustPizza implements Pizza{
    private String desc;
    private int cost = 200;

    public ThinCrustPizza (String desc) {
        this.desc = desc;
    }

    @Override
    public String getDescription() {
        return (desc);
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
