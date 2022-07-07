package com.designpatterns.structural.decorator;

public class PizzaCrust implements Pizza {

    @Override
    public String getToppings() {
        return "Thin Crust";
    }

    @Override
    public double getCost() {

        System.out.println("Cost of Dough: " + 100.00);
        return 100.00;
    }
}
