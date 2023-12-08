package com.library.services;

import com.library.books.Book;
import com.library.users.Member;


import java.time.LocalDate;
import java.util.Date;

public class Invoice {

    public static int currentID = 0;
    public static final int MAX_DAYS_TO_KEEP = 14;
    private int invoiceId;
    private Book book;
    private Member member;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private double price;

    public Invoice(Book book, Member member) {
        this.invoiceId = currentID++;
        this.book = book;
        this.member = member;
        this.issueDate = LocalDate.now();
        this.dueDate = issueDate.plusDays(MAX_DAYS_TO_KEEP);
        this.price = book.getPrice();
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public Member getMember() {
        return member;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public double getPrice() {
        return price;
    }

    public Book getBook() {
        return book;
    }

    public Member getReader() {
        return member;
    }

    public String toString() {
        return "Invoice{" +
                "book=" + book +
                ", reader=" + member +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", price=" + price +
                '}';
    }
}
