package com.designpatterns.structural.bridge;

public class ShapeAnalyzer {

    public static void main(String[] args) {

        IColor red = new Red();
        IColor blue = new Blue();

        Shape circle = new Circle(red);
        Shape rectangle = new Rectangle(blue);

        // Paint shapes
        circle.paint();
        rectangle.paint();
    }
}
