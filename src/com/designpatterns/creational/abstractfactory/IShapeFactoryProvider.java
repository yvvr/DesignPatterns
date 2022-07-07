package com.designpatterns.creational.abstractfactory;

public interface IShapeFactoryProvider {

    IShapeFactory getFactory(String factoryType);
}
