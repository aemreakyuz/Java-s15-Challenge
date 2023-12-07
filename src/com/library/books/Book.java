package com.library.books;

import com.library.books.enums.BookStatus;
import com.library.books.enums.Category;
import com.library.readers.Reader;

public abstract class Book  {

    private long id;
    private String name;
    private String author;
    private BookStatus bookStatus;
    private double price;
    private Category category;
    private Reader reader ;


    public Book(long id, String name, String author, double price, Category category) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
        this.bookStatus = BookStatus.AVAILABLE;
        this.category = category;
        this.reader = null;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public Category getCategory() {
        return category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BookStatus getBookStatus() {

        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookStatus=" + bookStatus +
                ", price=" + price +
                ", category=" + category +
                ", reader=" + reader +
                '}';
    }
}
