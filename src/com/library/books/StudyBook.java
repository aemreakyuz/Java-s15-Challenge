package com.library.books;

import com.library.books.enums.Category;

public class StudyBook extends Book {
    private static final double price = 10;

    public StudyBook(long id, String name, String author) {
        super(id, name,author, price, Category.STUDY_BOOK);
    }
}
