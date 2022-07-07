package com.designpatterns.structural.flyweight.pattern;

public class StoreAnalyzer {

    private static final int TYPES_OF_BOOKS = 2;
    private static final int NO_OF_BOOKS = 10000000;

    public static void main(String[] args) {
        BookStore store = new BookStore();

        // Will create 10M books.
        for (int i = 0; i < NO_OF_BOOKS / TYPES_OF_BOOKS; i++) {
            store.storeBook("Book-" + i, (i + 1) * 10, "Action", "Westland Publications", "1978");
            store.storeBook(
                    "Book-" + (i + 1),
                    (i + 2) * 10,
                    "Fantasy",
                    "Taxmann Publications pvt. Ltd.",
                    "1950");
        }

        // This will take Total Memory occupied : (Book size) 20 bytes * 10M + (BookType size) 30 bytes * 2 = 191.73 MB

        store.displayBooks();
    }
}
