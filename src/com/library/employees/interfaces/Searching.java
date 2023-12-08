package com.library.employees.interfaces;

import com.library.services.Library;

public interface Searching {
    void displayBookById(long id, Library library);
    void displayBookByTitle(String title, Library library);
    void displayBooksByAuthor(String author, Library library);
    void displayBooksByCategory();
    void displayBooks(Library library);
}
