package com.designpatterns.creational.abstractfactory;

public class RoundedSquare implements IShape {

    public static final String TAG = "RoundedSquare";

    private final float side;
    private final float roundedEdge;

    public RoundedSquare(float side, float roundedEdge) {
        this.side = side;
        this.roundedEdge = roundedEdge;
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
        System.out.printf(
                "Square:: area:%f, perimeter:%f, roundedEdge:%f%n",
                area(), perimeter(), roundedEdge);
    }
}
