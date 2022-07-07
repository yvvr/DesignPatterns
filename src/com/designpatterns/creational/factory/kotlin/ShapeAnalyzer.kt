package com.designpatterns.creational.factory.kotlin

class ShapeAnalyzer(private val shapeFactory: IShapeFactory) {

    fun analyzeShapes() {
        // Get shapes
        val circularShape = shapeFactory.getShape(Circle.TAG)
        val rectangularShape = shapeFactory.getShape(Rectangle.TAG)
        val squareShape = shapeFactory.getShape(Square.TAG)

        // Draw shapes
        circularShape.draw()
        rectangularShape.draw()
        squareShape.draw()
    }
}