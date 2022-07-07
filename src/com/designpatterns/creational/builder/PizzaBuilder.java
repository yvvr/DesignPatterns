package com.designpatterns.creational.builder;

public class PizzaBuilder implements IPizzaBuilder {

    private final Pizza pizza;

    public PizzaBuilder() {
        pizza = new Pizza();
    }

    @Override
    public PizzaBuilder setCrustType(Crust crust) {
        pizza.setCrustType(crust);
        return this;
    }

    @Override
    public PizzaBuilder setSize(int noOfSlices) {
        pizza.setSize(noOfSlices);
        return this;
    }

    @Override
    public PizzaBuilder setMozzarella(boolean needMozzarella) {
        pizza.setMozzarella(needMozzarella);
        return this;
    }

    @Override
    public PizzaBuilder setPepperoni(boolean needPepperoni) {
        pizza.setPepperoni(needPepperoni);
        return this;
    }

    @Override
    public PizzaBuilder setOlives(boolean needOlives) {
        pizza.setOlives(needOlives);
        return this;
    }

    @Override
    public PizzaBuilder setMushroom(boolean needMushroom) {
        pizza.setMushroom(needMushroom);
        return this;
    }

    @Override
    public PizzaBuilder setCapsicum(boolean needCapsicum) {
        pizza.setCapsicum(needCapsicum);
        return this;
    }

    @Override
    public PizzaBuilder setOnions(boolean needOnions) {
        pizza.setOnions(needOnions);
        return this;
    }

    @Override
    public Pizza build() {
        return pizza;
    }
}
