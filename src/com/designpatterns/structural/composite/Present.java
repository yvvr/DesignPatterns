package com.designpatterns.structural.composite;

public class Present {

    private final BoxComponent component;

    public Present(BoxComponent component) {
        this.component = component;
    }

    public float getPrice() {
        return component.getProductPrice();
    }
}
