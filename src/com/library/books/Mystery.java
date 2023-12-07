package com.library.books;

import com.library.books.enums.Category;

public class Mystery extends Book{

    private static final double price = 9;

    public Mystery(long id, String name, String author) {
        super(id, name,author, price, Category.MYSTERY);
    }
}
