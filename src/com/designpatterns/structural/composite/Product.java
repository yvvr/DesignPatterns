package com.designpatterns.structural.composite;

public class Product extends BoxComponent {

    private final String name;
    private final float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getProductName() {
        return name;
    }

    @Override
    public float getProductPrice() {
        return price;
    }
}
