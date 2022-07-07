package com.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;

public class StockGrabber implements StockSubject {

    private ArrayList<StockObserver> observerList;
    private HashMap<String, Double> stockPriceMap;

    public static final String GOOGLE_STOCK = "google";
    public static final String APPLE_STOCK = "apple";
    public static final String MICROSOFT_STOCK = "microsoft";
    public static final String AMAZON_STOCK = "amazon";

    public StockGrabber() {
        observerList = new ArrayList<>();
        stockPriceMap = new HashMap<>();
    }

    @Override
    public void register(StockObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(StockObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (StockObserver observer : observerList) {
            observer.update(stockPriceMap);
        }
    }

    public void setStockPrice(String stock, double price) {
        stockPriceMap.put(stock, price);
        notifyObserver();
    }
}
