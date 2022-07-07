package com.designpatterns.creational.abstractfactory.kotlin

class RoundedSquare(private val side: Float, private val roundedEdge: Float) : IShape {

    override fun area(): Float {
        return side * side
    }

    override fun perimeter(): Float {
        return 4 * side
    }

    override fun draw() {
        System.out.printf("Square:: area:%f, perimeter:%f, roundedEdge:%f%n", area(), perimeter(), roundedEdge)
    }

    companion object {
        const val TAG = "RoundedSquare"
    }
}