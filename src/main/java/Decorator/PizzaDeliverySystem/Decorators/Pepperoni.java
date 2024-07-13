package Decorator.PizzaDeliverySystem.Decorators;

import Decorator.PizzaDeliverySystem.Components.Pizza;

public class Pepperoni implements BaseDecorator{
    Pizza pizza;
    private String desc;
    private int cost = 50;

    public Pepperoni(Pizza pizza){
        this.pizza = pizza;
        this.desc = "Pepperoni";
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
