package com.designpatterns.structural.flyweight.pattern;

public class Book {
    private final String name;
    private final double price;
    private final BookType type;

    public Book(String name, double price, BookType type) {
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type.getType();
    }

    public String getDistribution() {
        return type.getDistribution();
    }

    public String getData() {
        return type.getData();
    }
}
