package com.library.financial;

import com.library.books.Book;
import com.library.readers.Reader;


import java.time.LocalDate;

public class Invoice {
  private Book book;
  private Reader reader;
  private LocalDate issueDate;
  private LocalDate dueDate;
  private double price;


    public Invoice(Book book, Reader reader, LocalDate issueDate, LocalDate dueDate, double price) {
        this.book = book;
        this.reader = reader;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.price = price;
    }



    public LocalDate getIssueDate() {
        return issueDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public double getPrice() {
        return price;
    }

    public Book getBook() {
        return book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        return "Invoice{" +
                "book=" + book +
                ", reader=" + reader +
                ", issueDate=" + issueDate +
                ", dueDate=" + dueDate +
                ", price=" + price +
                '}';
    }
}
