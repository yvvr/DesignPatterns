package com.designpatterns.creational.factory;

public class Rectangle implements IShape {

    public static final String TAG = "Rectangle";

    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float area() {
        return length * width;
    }

    @Override
    public float perimeter() {
        return 2 * (length + width);
    }

    @Override
    public void draw() {
        System.out.printf("Rectangle:: area:%f, perimeter:%f%n", area(), perimeter());
    }
}
