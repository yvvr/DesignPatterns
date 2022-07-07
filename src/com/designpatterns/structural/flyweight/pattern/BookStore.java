package com.designpatterns.structural.flyweight.pattern;

import java.util.ArrayList;
import java.util.List;

public class BookStore {

    private final List<Book> booksList = new ArrayList<>();

    public void storeBook(
            String name, double price, String type, String distribution, String data) {
        // Fetch the book type from Flyweight factory
        BookType bookType = BookTypeFactory.getBookType(type, distribution, data);

        booksList.add(new Book(name, price, bookType));
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
