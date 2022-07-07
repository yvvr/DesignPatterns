package com.designpatterns.behavioral.observer;

import java.util.HashMap;
import java.util.Map;

public class StockMonitor implements StockObserver {

    private HashMap<String, Double> stockPriceMap;
    private StockSubject stockGrabber;

    public StockMonitor(StockSubject stockGrabber) {
        this.stockGrabber = stockGrabber;
        stockGrabber.register(this);

        stockPriceMap = new HashMap<>();
    }

    @Override
    public void update(HashMap<String, Double> priceMap) {
        for (Map.Entry element : priceMap.entrySet()) {
            stockPriceMap.put((String) element.getKey(), (double) element.getValue());
        }
        printStocks();
    }

    public void printStocks() {
        for (Map.Entry element : stockPriceMap.entrySet()) {
            System.out.println(element.getKey() + " Stock : " + element.getValue());
        }
    }
}
