package com.designpatterns.structural.composite;

public class Customer {

    public static void main(String[] args) {

        BoxComponent giftBox = new SurpriseBox("Gift box");

        BoxComponent stationary = new SurpriseBox("Stationary");
        stationary.add(new Product("Pen", 100.00f));
        stationary.add(new Product("NoteBook", 300.00f));
        stationary.add(new Product("Marker", 50.00f));

        BoxComponent painting = new SurpriseBox("Painting");
        painting.add(new Product("Drawing book", 250.00f));
        painting.add(new Product("Colors", 800.00f));

        giftBox.add(stationary);
        giftBox.add(painting);
        giftBox.add(new Product("Chocolates", 100.00f));
        giftBox.add(new Product("Toys", 1500.00f));

        Present present = new Present(giftBox);
        System.out.println("Gift box price:" + present.getPrice());
    }
}
