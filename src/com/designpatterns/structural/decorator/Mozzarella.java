package com.designpatterns.structural.decorator;

public class Mozzarella extends ToppingDecorator {

    public Mozzarella(Pizza newPizza) {
        super(newPizza);
    }

    @Override
    public String getToppings() {
        return pizza.getToppings() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        System.out.println("Cost of Mozzarella: 15.00");
        return pizza.getCost() + 15;
    }
}
