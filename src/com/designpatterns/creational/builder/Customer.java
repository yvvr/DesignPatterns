package com.designpatterns.creational.builder;

public class Customer {

    private final Chef chef;

    public Customer(Chef chef) {
        this.chef = chef;
    }

    public void orderAndEatPizza() {
        // Get pepperoni pizza and eat.
        Pizza pizza = chef.getPepperoniPizza();
        System.out.println("PepperoniPizza:" + pizza.eatPizza());
        // Get pepperoni pizza and eat.
        Pizza pizza1 = chef.getSupremeVegPizza();
        pizza1.eatPizza();
        System.out.println("SupremeVegPizza:" + pizza1.eatPizza());
    }
}
