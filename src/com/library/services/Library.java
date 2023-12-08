package com.library.services;

import com.library.books.Book;
import com.library.books.enums.BookStatus;
import com.library.books.enums.Category;
import com.library.employees.Librarian;
import com.library.services.Invoice;
import com.library.users.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<Long, Book> books;
    private HashMap<Long, Member> members;
    private HashMap<Integer, Invoice> invoices;
    private Librarian librarian;


    public Library(Librarian librarian) {
        books = new HashMap<Long, Book>();
        members = new HashMap<Long, Member>();
        invoices = new HashMap<Integer, Invoice>();
        this.librarian = librarian;
    }

    public HashMap<Long, Book> getBooks() {
        return books;
    }

    public void setBooks(HashMap<Long, Book> books) {
        this.books = books;
    }

    public HashMap<Long, Member> getMembers() {
        return members;
    }

    public void setMembers(HashMap<Long, Member> members) {
        this.members = members;
    }

    public HashMap<Integer, Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(HashMap<Integer, Invoice> invoices) {
        this.invoices = invoices;
    }

    public Librarian getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Librarian librarian) {
        this.librarian = librarian;
    }

    public void addNewBook(Book book) {
        books.put(book.getBookId(), book);
        System.out.println(book + " is added.");
    }

    public void rentBook(Book book) {
        books.remove(book.getBookId());
    }

    public void rentBook(Book book, Member member) {
        if (member.getCurrentMoney() >= book.getPrice() && member.getInvoices().size()<5 && book.getBookStatus().equals(BookStatus.AVAILABLE)) {
            Invoice invoice = InvoiceService.createInvoice(book, member);
            invoices.put(invoice.getInvoiceId(), invoice);
            member.getInvoices().add(invoice);
            member.setCurrentMoney(member.getCurrentMoney() - book.getPrice());
            books.remove(invoice.getBook().getBookId());
            book.setBookStatus(BookStatus.RENTED);
            System.out.println("You succesfully rented " + book);
        } else {
            System.out.println("You don't have enough money to get this book");
        }
    }

    public void returnBook(Invoice invoice) {
        Member member = invoice.getMember();
        member.setCurrentMoney(member.getCurrentMoney() + InvoiceService.returnInvoice(invoice));
        books.put(invoice.getBook().getBookId(), invoice.getBook());
    }


    public Book getBookByID(long bookId) {
        return books.get(bookId);
    }

    public String toString() {
        return "Library{" +
                "books=" + books +
                ", readers=" + members +
                '}';
    }
}
