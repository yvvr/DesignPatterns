package com.designpatterns.behavioral.observer;

public interface StockSubject {

    public void register(StockObserver observer);

    public void unregister(StockObserver observer);

    public void notifyObserver();
}
