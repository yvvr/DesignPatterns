package com.designpatterns.behavioral.observer;

public class GrabStocks {

    public void updateStockSet1(StockGrabber stockGrabber) {
        stockGrabber.setStockPrice(StockGrabber.GOOGLE_STOCK, 134.45);
        stockGrabber.setStockPrice(StockGrabber.APPLE_STOCK, 234.56);
        stockGrabber.setStockPrice(StockGrabber.MICROSOFT_STOCK, 178.92);
        stockGrabber.setStockPrice(StockGrabber.AMAZON_STOCK, 1232.45);
    }

    public void updateStockSet2(StockGrabber stockGrabber) {
        stockGrabber.setStockPrice(StockGrabber.GOOGLE_STOCK, 156.45);
        stockGrabber.setStockPrice(StockGrabber.APPLE_STOCK, 295.56);
        stockGrabber.setStockPrice(StockGrabber.MICROSOFT_STOCK, 199.92);
        stockGrabber.setStockPrice(StockGrabber.AMAZON_STOCK, 1436.85);
    }

    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();

        StockMonitor stockMonitor1 = new StockMonitor(stockGrabber);

        GrabStocks grabStocks = new GrabStocks();
        grabStocks.updateStockSet1(stockGrabber);

        grabStocks.updateStockSet2(stockGrabber);
    }
}
