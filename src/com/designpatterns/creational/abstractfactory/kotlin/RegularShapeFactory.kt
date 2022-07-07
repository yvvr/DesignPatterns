package com.designpatterns.creational.abstractfactory.kotlin

import java.lang.IllegalArgumentException

class RegularShapeFactory : IShapeFactory {

    override fun getShape(shapeType: String): IShape {

        return if (shapeType.equals(Rectangle.TAG, ignoreCase = true)) {
            Rectangle(4.0f, 5.0f)
        } else if (shapeType.equals(Square.TAG, ignoreCase = true)) {
            Square(5.0f)
        } else {
            throw IllegalArgumentException("Regular shape type not found")
        }
    }

    companion object {
        const val TAG = "RegularShapeFactory"
    }
}