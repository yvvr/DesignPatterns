package com.designpatterns.creational.abstractfactory;

public class RoundedRectangle implements IShape {

    public static final String TAG = "RoundedRectangle";

    private final float length;
    private final float width;
    private final float roundedEdge;

    public RoundedRectangle(float length, float width, float roundedEdge) {
        this.length = length;
        this.width = width;
        this.roundedEdge = roundedEdge;
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
        System.out.printf(
                "Rectangle:: area:%f, perimeter:%f, roundedEdge:%f%n",
                area(), perimeter(), roundedEdge);
    }
}
