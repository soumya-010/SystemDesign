package Decorator.PizzaDeliverySystem.Decorators;

import Decorator.PizzaDeliverySystem.Components.Pizza;

public class CheeseBurst implements BaseDecorator{
    Pizza pizza;
    private String desc;
    private int cost = 30;

    public CheeseBurst(Pizza pizza){
        this.pizza = pizza;
        this.desc = "Cheese Burst";
    }
    @Override
    public String getDescription() {
        return (pizza.getDescription() + " with " + this.desc);
    }

    @Override
    public int getCost() {
        return (pizza.getCost() + this.cost);
    }
}
