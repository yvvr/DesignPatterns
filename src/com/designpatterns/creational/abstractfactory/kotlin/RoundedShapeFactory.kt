package com.designpatterns.creational.abstractfactory.kotlin

import java.lang.IllegalArgumentException

class RoundedShapeFactory : IShapeFactory {

    override fun getShape(shapeType: String): IShape {

        return if (shapeType.equals(RoundedRectangle.TAG, ignoreCase = true)) {
            RoundedRectangle(4.0f, 5.0f, 0.5f)
        } else if (shapeType.equals(RoundedSquare.TAG, ignoreCase = true)) {
            RoundedSquare(5.0f, 0.5f)
        } else {
            throw IllegalArgumentException("Rounded shape type not found")
        }
    }

    companion object {
        const val TAG = "RoundedShapeFactory"
    }
}