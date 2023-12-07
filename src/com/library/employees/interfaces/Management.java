package com.library.employees.interfaces;

import com.library.books.Book;
import com.library.readers.Reader;

import java.util.List;

public interface Management {
    void addBook(Book book);
    void removeBookById(int bookId);
    void assistPurchase(Reader reader ,Book book);
    void assistReturn(Reader reader , Book book);
    List<Book> searchBook(String title);
}
