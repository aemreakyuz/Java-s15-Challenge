package com.library.employees;

import com.library.books.Book;
import com.library.books.enums.BookStatus;
import com.library.books.enums.Category;
import com.library.employees.interfaces.Management;
import com.library.financial.Invoice;
import com.library.model.Library;
import com.library.readers.Reader;

import java.time.LocalDate;
import java.util.List;

public class Librarian extends Employee implements Management {

    public Librarian(String name, int password) {
        super(name, password);
    }

    public Librarian(Library library) {
        super(library);
    }

    public void showStatus(Book book){
        System.out.println(book.getBookStatus());
    }

    public void showReader (Book book){
        System.out.println(book.getReader());
    }

    public void addBook(Book book) {
        getLibrary().addNewBook(book);
        System.out.println(book + " is added.");
    }

    public void removeBookById(int bookId) {
        Book book = getLibrary().getBookByID(bookId);
        if(getLibrary().getBooks().contains(book)){
            getLibrary().getBooks().remove(book);
            System.out.println(book + " is removed.");
        }
        else {
            System.out.println("Book with ID " + bookId + " could not be found");
        }
    }
    public List<Book> searchBook(String title) {
        List<Book> foundBooks = getLibrary().searchBooksByTitle(title);
        if (foundBooks.isEmpty()) {
            System.out.println("No books found with title: " + title);
            return null;
        } else {
            for (Book book : foundBooks) {
                System.out.println("Found Books: " + book);
            }
            return foundBooks;
        }
    }


    public Invoice createInvoice(Book book, Reader reader) {
        if (book.getBookStatus().equals(BookStatus.AVAILABLE) && reader.getPurchasedBooks().size() < 5) {
            LocalDate issueDate = LocalDate.now();
            LocalDate dueDate = issueDate.plusDays(14);
            double price = book.getPrice();
            Invoice invoice = new Invoice(book, reader, issueDate, dueDate, price);
            getLibrary().getInvoices().add(invoice);
            return invoice;
        }
        return null;
    }

    public Invoice getInvoice(Book book, Reader reader){
        for(Invoice invoice : getLibrary().getInvoices()){
            if(invoice.getReader().equals(reader.getName())){
                System.out.println(invoice);
                return invoice;
            }
        }
        return null;
    }

    public void assistPurchase(Reader reader, Book book) {
        if(reader.getPurchasedBooks().size()>5){
            System.out.println("You cannot purchase any books. Please return at least one");
        }
        if(reader.getPurchasedBooks().contains(book)){
            System.out.println("You already rented this book");
        }
        if(getLibrary().getBooks().contains(book) && (book.getBookStatus().equals(BookStatus.RENTED)) && reader.getPurchasedBooks().size()<5){
            book.setBookStatus(BookStatus.RENTED);
            book.setReader(reader);
            Invoice invoice = createInvoice(book, reader);
            reader.getPurchasedBooks().add(book);
            getLibrary().getReaders().add(reader);
            System.out.println(book + " is rented for " + book.getPrice() + " dollars" + " Invoice: " + invoice);
        }
        else{
            System.out.println(book + " is not in the library.");
        }
    }

    public void assistReturn(Reader reader, Book book) {
        if(book.getReader() == reader) {
            book.setBookStatus(BookStatus.AVAILABLE);
            System.out.println(book.getName() + " has been returned by " + book.getReader());
            book.setReader(null);
        }
        else {
            System.out.println("This book was not borrowed by this reader.");
        }
    }

    public void editBook(Book book, String name, String author, BookStatus bookStatus, double price, Category category, Reader reader){
        if (getLibrary().getBooks().contains(book)) {
            book.setName(name);
            book.setAuthor(author);
            book.setBookStatus(bookStatus);
            book.setPrice(price);
            book.setCategory(category);
            book.setReader(reader);
        }
    }



}
