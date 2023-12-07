package com.library.books;

import com.library.books.enums.Category;

public class Magazine extends Book{

    private static final double price = 7;

    public Magazine(long id, String name, String author) {
        super(id, name, author,  price, Category.MAGAZINE);

    }
}

