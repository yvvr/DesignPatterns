package com.designpatterns.structural.composite;

public abstract class BoxComponent {

    // To add a box component.
    public void add(BoxComponent boxComponent) {

        throw new UnsupportedOperationException("Operation not supported");
    }

    // To remove a box component.
    public void remove(BoxComponent boxComponent) {

        throw new UnsupportedOperationException("Operation not supported");
    }

    // To get the components at index

    public BoxComponent getBoxComponent(int boxComponentIndex) {

        throw new UnsupportedOperationException("Operation not supported");
    }

    // To retrieve the product name.
    public String getProductName() {

        throw new UnsupportedOperationException("Operation not supported");
    }

    // To get the product price.
    public float getProductPrice() {

        throw new UnsupportedOperationException("Operation not supported");
    }
}
