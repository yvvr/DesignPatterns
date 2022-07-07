package com.designpatterns.creational.abstractfactory.kotlin

class Square(private val side: Float) : IShape {

    override fun area(): Float {
        return side * side
    }

    override fun perimeter(): Float {
        return 4 * side
    }

    override fun draw() {
        System.out.printf("Square:: area:%f, perimeter:%f%n", area(), perimeter())
    }

    companion object {
        const val TAG = "Square"
    }
}