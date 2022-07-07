package com.designpatterns.creational.factory.kotlin

import java.lang.IllegalArgumentException

class ShapeFactory : IShapeFactory {

    override fun getShape(shapeType: String): IShape {

        return if (shapeType.equals(Circle.TAG, ignoreCase = true)) {
            Circle(5.0f)
        } else if (shapeType.equals(Rectangle.TAG, ignoreCase = true)) {
            Rectangle(4.0f, 5.0f)
        } else if (shapeType.equals(Square.TAG, ignoreCase = true)) {
            Square(5.0f)
        } else {
            throw IllegalArgumentException("Shape type not found")
        }
    }
}