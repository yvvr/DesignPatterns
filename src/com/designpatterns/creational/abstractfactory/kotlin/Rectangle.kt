package com.designpatterns.creational.abstractfactory.kotlin

class Rectangle(private val length: Float, private val width: Float) : IShape {

    override fun area(): Float {
        return length * width
    }

    override fun perimeter(): Float {
        return 2 * (length + width)
    }

    override fun draw() {
        System.out.printf("Rectangle:: area:%f, perimeter:%f%n", area(), perimeter())
    }

    companion object {
        const val TAG = "Rectangle"
    }
}