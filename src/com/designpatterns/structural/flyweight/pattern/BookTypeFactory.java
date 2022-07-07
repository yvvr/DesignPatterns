package com.designpatterns.structural.flyweight.pattern;

import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {

    private static final Map<String, BookType> bookTypes = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String data) {
        if (bookTypes.get(type) == null) {
            bookTypes.put(type, new BookType(type, distributor, data));
        }
        return bookTypes.get(type);
    }
}
