package com.designpatterns.creational.abstractfactory.kotlin

interface IShapeFactory {

    fun getShape(shapeType: String): IShape
}