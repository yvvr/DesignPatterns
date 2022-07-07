package com.designpatterns.creational.builder;

public class Chef implements IChef {

    @Override
    public Pizza getPepperoniPizza() {
        return new PizzaBuilder()
                .setCrustType(Crust.CheeseCrust)
                .setPepperoni(true)
                .setCapsicum(true)
                .setMozzarella(true)
                .setMushroom(false)
                .setOlives(false)
                .setSize(8)
                .build();
    }

    @Override
    public Pizza getSupremeVegPizza() {
        return new PizzaBuilder()
                .setCrustType(Crust.CheeseCrust)
                .setPepperoni(false)
                .setCapsicum(false)
                .setMozzarella(true)
                .setOlives(true)
                .setMushroom(true)
                .setSize(8)
                .build();
    }
}
