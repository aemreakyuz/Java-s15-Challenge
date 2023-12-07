package com.library.books;

import com.library.books.enums.Category;

public class AudioBook extends Book {

    private static final double price = 3;

    public AudioBook(long id, String name, String author) {
        super(id, name,author, price, Category.AUDIO_BOOK);
    }
}
