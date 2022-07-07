package com.designpatterns.structural.facade;

public class Customer {

    public static void main(String[] args) {

        IRestaurant restaurant = new Restaurant(new Waiter(), new Kitchen());

        restaurant.orderFood();
    }
}
