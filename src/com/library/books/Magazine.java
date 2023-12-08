package com.library.books;

import com.library.books.enums.Category;

public class Magazine extends Book{

    private static final double PRICE = 9;

    public Magazine(String name, String author) {
        super(name, author, Category.MAGAZINE);

    }

   protected double setPrice() {
        return PRICE;
    }


}

