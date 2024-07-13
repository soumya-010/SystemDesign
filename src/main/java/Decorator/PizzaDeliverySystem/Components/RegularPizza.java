package Decorator.PizzaDeliverySystem.Components;

public class RegularPizza implements Pizza{
    private String desc;
    private int cost = 100;

    public RegularPizza (String desc) {
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
