package com.designpatterns.structural.decorator;

public class Pepperoni extends ToppingDecorator {

    public Pepperoni(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getToppings() {
        return pizza.getToppings() + ", Pepperoni";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Pepperoni: 20.00");
        return pizza.getCost() + 20.00;
    }
}
