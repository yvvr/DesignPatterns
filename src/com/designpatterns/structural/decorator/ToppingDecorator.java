package com.designpatterns.structural.decorator;

public class ToppingDecorator implements Pizza {

    protected Pizza pizza;

    public ToppingDecorator(Pizza newPizza) {

        pizza = newPizza;
    }

    @Override
    public String getToppings() {
        return pizza.getToppings();
    }

    @Override
    public double getCost() {
        return pizza.getCost();
    }
}
