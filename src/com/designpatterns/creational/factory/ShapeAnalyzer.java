package com.designpatterns.creational.factory;

public class ShapeAnalyzer {

    private final IShapeFactory shapeFactory;

    public ShapeAnalyzer(IShapeFactory shapeFactory) {
        this.shapeFactory = shapeFactory;
    }

    public void analyzeShapes() {
        IShape circularShape = shapeFactory.getShape(Circle.TAG);
        IShape rectangularShape = shapeFactory.getShape(Rectangle.TAG);
        IShape squareShape = shapeFactory.getShape(Square.TAG);

        circularShape.draw();
        rectangularShape.draw();
        squareShape.draw();
    }
}
