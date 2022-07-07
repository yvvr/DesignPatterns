package com.designpatterns.structural.facade;

public class Restaurant implements IRestaurant {

    private final Waiter waiter;
    private final Kitchen kitchen;

    public Restaurant(Waiter waiter, Kitchen kitchen) {
        this.waiter = waiter;
        this.kitchen = kitchen;
    }

    @Override
    public void orderFood() {
        waiter.takeOrder();
        waiter.sendToKitchen();

        kitchen.prepareFood();
        kitchen.callWaiter();

        waiter.servesFood();
        kitchen.washDishes();
    }
}
