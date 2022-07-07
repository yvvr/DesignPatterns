package com.designpatterns.creational.factory;

public class Circle implements IShape {

    public static final String TAG = "Circle";

    private final float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) (3.14 * radius * radius);
    }

    @Override
    public float perimeter() {
        return (float) (2 * 3.14 * radius);
    }

    @Override
    public void draw() {
        System.out.printf("Circle:: area:%f, perimeter:%f%n", area(), perimeter());
    }
}
