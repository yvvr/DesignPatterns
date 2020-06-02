package com.designpatterns.observer;

public interface StockSubject {

    public void register(StockObserver observer);

    public void unregister(StockObserver observer);

    public void notifyObserver();
}
