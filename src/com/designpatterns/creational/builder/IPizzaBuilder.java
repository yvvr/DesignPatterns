package com.designpatterns.creational.builder;

public interface IPizzaBuilder {

    PizzaBuilder setCrustType(Crust crust);

    PizzaBuilder setSize(int noOfSlices);

    PizzaBuilder setMozzarella(boolean needMozzarella);

    PizzaBuilder setPepperoni(boolean needPepperoni);

    PizzaBuilder setOlives(boolean needOlives);

    PizzaBuilder setMushroom(boolean needMushroom);

    PizzaBuilder setCapsicum(boolean needCapsicum);

    PizzaBuilder setOnions(boolean needOnions);

    Pizza build();
}
