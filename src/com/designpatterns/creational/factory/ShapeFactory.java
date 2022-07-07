package com.designpatterns.creational.factory;

public class ShapeFactory implements IShapeFactory {

    @Override
    public IShape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase(Circle.TAG)) {
            return new Circle(5.0f);
        } else if (shapeType.equalsIgnoreCase(Rectangle.TAG)) {
            return new Rectangle(4.0f, 5.0f);
        } else if (shapeType.equalsIgnoreCase(Square.TAG)) {
            return new Square(5.0f);
        } else {
            return null;
        }
    }
}
