package com.designpatterns.creational.abstractfactory;

public class RoundedShapeFactory implements IShapeFactory {

    public static final String TAG = "RoundedShapeFactory";

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(RoundedRectangle.TAG)) {
            return new RoundedRectangle(4.0f, 5.0f, 0.5f);
        } else if (shapeType.equalsIgnoreCase(RoundedSquare.TAG)) {
            return new RoundedSquare(5.0f, 0.5f);
        } else {
            throw new IllegalArgumentException("Rounded shape type not found");
        }
    }
}
