package com.designpatterns.creational.factory.kotlin

interface IShapeFactory {

    fun getShape(shapeType: String): IShape
}