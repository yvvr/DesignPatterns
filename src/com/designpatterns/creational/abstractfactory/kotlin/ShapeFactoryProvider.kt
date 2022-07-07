package com.designpatterns.creational.abstractfactory.kotlin

import java.lang.IllegalArgumentException

class ShapeFactoryProvider : IShapeFactoryProvider {

    override fun getFactory(factoryType: String): IShapeFactory {

        return if (factoryType.equals(RegularShapeFactory.TAG, ignoreCase = true)) {
            RegularShapeFactory()
        } else if (factoryType.equals(RoundedShapeFactory.TAG, ignoreCase = true)) {
            RoundedShapeFactory()
        } else {
            throw IllegalArgumentException("Factory type not found")
        }
    }
}