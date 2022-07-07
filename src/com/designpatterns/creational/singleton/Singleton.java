package com.designpatterns.creational.singleton;

import org.jetbrains.annotations.Contract;

public class Singleton {

    private static Singleton instance;

    @Contract(pure = true)
    private Singleton() {}

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
