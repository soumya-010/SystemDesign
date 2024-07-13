package Decorator.PizzaDeliverySystem.Components;

public class PanTossedPizza implements Pizza{
    private String desc;
    private int cost = 150;

    public PanTossedPizza (String desc) {
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
