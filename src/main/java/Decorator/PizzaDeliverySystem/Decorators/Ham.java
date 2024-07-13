package Decorator.PizzaDeliverySystem.Decorators;

import Decorator.PizzaDeliverySystem.Components.Pizza;

public class Ham implements BaseDecorator {
    Pizza pizza;
    private String desc;
    private int cost = 40;

    public Ham(Pizza pizza){
        this.pizza = pizza;
        this.desc = "Ham";
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
