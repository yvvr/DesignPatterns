package com.designpatterns.structural.flyweight.pattern;

public class BookType {

    private final String type;
    private final String distribution;
    private final String data;

    public BookType(String type, String distribution, String data) {
        this.type = type;
        this.distribution = distribution;
        this.data = data;
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
