package com.designpatterns.structural.flyweight;

public class Book {

    private final String name;
    private final double price;
    private final String type;
    private final String distribution;
    private final String data;

    public Book(String name, double price, String type, String distribution, String data) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.distribution = distribution;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public String getDistribution() {
        return distribution;
    }

    public String getData() {
        return data;
    }
}
