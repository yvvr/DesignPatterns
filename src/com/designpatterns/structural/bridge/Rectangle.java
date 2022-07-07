package com.designpatterns.structural.bridge;

public class Rectangle extends Shape{

    public Rectangle(IColor color) {
        super(color);
    }

    @Override
    public void paint() {
        System.out.println("Paint Rectangle with color " + color.fillColor());
    }
}
