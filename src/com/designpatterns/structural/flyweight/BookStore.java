package com.designpatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final List<Book> booksList = new ArrayList<>();

    public void storeBook(
            String name, double price, String type, String distribution, String data) {
        booksList.add(new Book(name, price, type, distribution, data));
    }

    public void displayBooks() {
        for (Book book : booksList) {
            System.out.printf(
                    "Book details: Name-%s, price-%s, type-%s, Distribution-%s, data-%s%n",
                    book.getName(),
                    book.getPrice(),
                    book.getType(),
                    book.getDistribution(),
                    book.getData());
        }
    }
}
