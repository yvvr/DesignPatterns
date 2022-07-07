package com.designpatterns.creational.factory;

public interface IShapeFactory {

    IShape getShape(String shapeType);
}
