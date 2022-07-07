package com.designpatterns.structural.facade;

public class Kitchen {

    public void prepareFood() {
        System.out.println("Chef is cooking food.");
    }

    public void callWaiter() {
        System.out.println("Call Waiter.");
    }

    public void washDishes() {
        System.out.println("Wash the dishes.");
    }
}
