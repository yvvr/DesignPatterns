package com.designpatterns.creational.abstractfactory.kotlin

class RoundedRectangle(private val length: Float, private val width: Float, private val roundedEdge: Float) : IShape {

    override fun area(): Float {
        return length * width
    }

    override fun perimeter(): Float {
        return 2 * (length + width)
    }

    override fun draw() {
        System.out.printf("Rectangle:: area:%f, perimeter:%f, roundedEdge:%f%n", area(), perimeter(), roundedEdge)
    }

    companion object {
        const val TAG = "RoundedRectangle"
    }
}