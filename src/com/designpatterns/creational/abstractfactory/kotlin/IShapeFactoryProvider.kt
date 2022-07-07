package com.designpatterns.creational.abstractfactory.kotlin

interface IShapeFactoryProvider {

    fun getFactory(factoryType: String): IShapeFactory
}