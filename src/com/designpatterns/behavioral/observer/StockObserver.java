package com.designpatterns.behavioral.observer;

import java.util.HashMap;

public interface StockObserver {
    public void update(HashMap<String, Double> priceMap);
}
