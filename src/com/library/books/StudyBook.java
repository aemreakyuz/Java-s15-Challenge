package com.library.books;

import com.library.books.enums.Category;

public class StudyBook extends Book {
    private static final double PRICE = 10;

    public StudyBook(String name, String author) {
        super(name, author, Category.STUDY_BOOK);

    }

    protected double setPrice() {
        return PRICE;
    }
}
