package com.library.books;

import com.library.books.enums.Category;

public class Mystery extends Book{

    private static final double PRICE = 9;

    public Mystery(String name, String author) {
        super(name, author, Category.MYSTERY);

    }

    protected double setPrice() {
        return PRICE;
    }
}
