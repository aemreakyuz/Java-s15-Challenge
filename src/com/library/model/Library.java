package com.library.model;

import com.library.books.Book;
import com.library.books.enums.BookStatus;
import com.library.financial.Invoice;
import com.library.readers.Reader;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private ArrayList<Book> books;
    private ArrayList<Reader> readers;
    private ArrayList<Invoice> invoices;

    public Library(ArrayList<Book> books, ArrayList<Reader> readers) {
        this.books = books;
        this.readers = readers;
    }

    public Library(ArrayList<Book> books, ArrayList<Reader> readers, ArrayList<Invoice> invoices) {
        this.books = books;
        this.readers = readers;
        this.invoices = invoices;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Reader> getReaders() {
        return readers;
    }

    public void setReaders(ArrayList<Reader> readers) {
        this.readers = readers;
    }

    public void addNewBook(Book book){
        books.add(book);
        System.out.println(book + " is added.");
    }

    public Book getBookByID(int bookId){
        for (Book book: books){
            if(book.getId() == bookId) {
                System.out.println(book);
                return book;
            }
        }
       return null;
    }

    public boolean rentBook(Book book){
        if(book.getBookStatus() != BookStatus.RENTED ){
            book.setBookStatus(BookStatus.RENTED);
            return true;
        }
        return false;
    }


    public boolean returnBook(Book book){
        if(book.getBookStatus() == BookStatus.RENTED){
            book.setBookStatus(BookStatus.AVAILABLE);
            return true;
        }
        return false;
    }


    public List<Book> searchBooksByTitle(String title) {
        List<Book> foundBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(title)){
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }

    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + readers +
                '}';
    }
}
