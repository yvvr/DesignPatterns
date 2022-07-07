package com.designpatterns.creational.abstractfactory;

public class AbstractFactoryAnalyzer {

    private final IShapeFactoryProvider shapeFactoryProvider;

    public AbstractFactoryAnalyzer(IShapeFactoryProvider shapeFactoryProvider) {
        this.shapeFactoryProvider = shapeFactoryProvider;
    }

    public void analyzeFactories() {
        IShapeFactory regularShapeFactory =
                shapeFactoryProvider.getFactory(RegularShapeFactory.TAG);
        IShapeFactory roundedShapeFactory =
                shapeFactoryProvider.getFactory(RoundedShapeFactory.TAG);

        // Regular shapes
        IShape rectangularShape = regularShapeFactory.getShape(Rectangle.TAG);
        IShape squareShape = regularShapeFactory.getShape(Square.TAG);

        // Rounded shapes
        IShape roundedRectangularShape = roundedShapeFactory.getShape(RoundedRectangle.TAG);
        IShape roundedSquareShape = roundedShapeFactory.getShape(RoundedSquare.TAG);

        // Draw
        rectangularShape.draw();
        squareShape.draw();
        roundedRectangularShape.draw();
        roundedSquareShape.draw();
    }
}
