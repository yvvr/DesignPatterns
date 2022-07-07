package com.designpatterns.creational.abstractfactory;

public class RegularShapeFactory implements IShapeFactory {

    public static final String TAG = "RegularShapeFactory";

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(Rectangle.TAG)) {
            return new Rectangle(4.0f, 5.0f);
        } else if (shapeType.equalsIgnoreCase(Square.TAG)) {
            return new Square(5.0f);
        } else {
            throw new IllegalArgumentException("Regular shape type not found");
        }
    }
}
