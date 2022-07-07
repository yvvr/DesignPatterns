package com.designpatterns.creational.abstractfactory.kotlin

class AbstractFactoryAnalyzer(private val shapeFactoryProvider: IShapeFactoryProvider) {

    fun analyzeFactories() {

        val regularShapeFactory = shapeFactoryProvider.getFactory(RegularShapeFactory.TAG)
        val roundedShapeFactory = shapeFactoryProvider.getFactory(RoundedShapeFactory.TAG)

        // Regular shapes
        val rectangularShape = regularShapeFactory.getShape(Rectangle.TAG)
        val squareShape = regularShapeFactory.getShape(Square.TAG)

        // Rounded shapes
        val roundedRectangularShape = roundedShapeFactory.getShape(RoundedRectangle.TAG)
        val roundedSquareShape = roundedShapeFactory.getShape(RoundedSquare.TAG)

        // Draw
        rectangularShape.draw()
        squareShape.draw()
        roundedRectangularShape.draw()
        roundedSquareShape.draw()
    }
}