package com.designpatterns.structural.bridge;

public class Circle extends Shape {

    public Circle(IColor color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Paint Circle with color " + color.fillColor());
    }
}
