package com.designpatterns.creational.abstractfactory;

public class ShapeFactoryProvider implements IShapeFactoryProvider {

    @Override
    public IShapeFactory getFactory(String factoryType) {
        if (factoryType == null) {
            return null;
        }
        if (factoryType.equalsIgnoreCase(RegularShapeFactory.TAG)) {
            return new RegularShapeFactory();
        } else if (factoryType.equalsIgnoreCase(RoundedShapeFactory.TAG)) {
            return new RoundedShapeFactory();
        } else {
            throw new IllegalArgumentException("Factory type not found");
        }
    }
}
