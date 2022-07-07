package com.designpatterns.creational.factory.kotlin

class Circle(private val radius: Float) : IShape {

    override fun area(): Float {
        return (3.14 * radius * radius).toFloat()
    }

    override fun perimeter(): Float {
        return (2 * 3.14 * radius).toFloat()
    }

    override fun draw() {
        System.out.printf("Circle:: area:%f, perimeter:%f%n", area(), perimeter())
    }

    companion object {
        const val TAG = "Circle"
    }
}