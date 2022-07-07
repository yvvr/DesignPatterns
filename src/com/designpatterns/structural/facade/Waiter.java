package com.designpatterns.structural.facade;

public class Waiter {

    public void takeOrder() {
        System.out.println("Waiter takes order.");
    }

    public void sendToKitchen() {
        System.out.println("Send order to kitchen");
    }

    public void servesFood() {
        System.out.println("customer is served food!!!.");
    }
}
