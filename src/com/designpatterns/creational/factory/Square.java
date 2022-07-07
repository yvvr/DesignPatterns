package com.designpatterns.creational.factory;

public class Square implements IShape {

    public static final String TAG = "Square";

    float side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public float area() {
        return side * side;
    }

    @Override
    public float perimeter() {
        return 4 * side;
    }

    @Override
    public void draw() {
        System.out.printf("Square:: area:%f, perimeter:%f%n", area(), perimeter());
    }
}
