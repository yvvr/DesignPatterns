package com.designpatterns.structural.decorator;

public class Olives extends ToppingDecorator {

    public Olives(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getToppings() {
        return pizza.getToppings() + ", Olives";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Olives: 30.00");
        return pizza.getCost() + 30.00;
    }
}
