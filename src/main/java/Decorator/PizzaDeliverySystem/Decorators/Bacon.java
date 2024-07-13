package Decorator.PizzaDeliverySystem.Decorators;

import Decorator.PizzaDeliverySystem.Components.Pizza;

public class Bacon implements BaseDecorator {
    Pizza pizza;
    private String desc;
    private int cost = 70;

    public Bacon(Pizza pizza){
        this.pizza = pizza;
        this.desc = "Bacon";
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
