package com.designpatterns.structural.decorator;

public class Chef {

    public static void main(String[] args) {

        Pizza pizza = new Pepperoni(new Mozzarella(new PizzaCrust()));
        System.out.println("Pizza Toppings: " + pizza.getToppings());
        System.out.println("Pizza Cost: " + pizza.getCost());
    }
}
