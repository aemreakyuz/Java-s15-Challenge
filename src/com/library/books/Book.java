package com.library.books;

import com.library.books.enums.BookStatus;
import com.library.books.enums.Category;
import com.library.services.Library;
import com.library.users.Member;

public abstract class Book  {

    private static long currentId = 0;
    private long bookId;
    private String name;
    private String author;
    private BookStatus bookStatus;
    private double price;
    private Category category;
    private Member member;
    private Library library;


    public Book( String name, String author, Category category) {
        this.bookId = currentId++;
        this.name = name;
        this.author = author;
        this.price = setPrice();
        this.bookStatus = BookStatus.AVAILABLE;
        this.category = category;
        this.member = null;
        this.library = library;
    }

   protected abstract double setPrice();

    public double getPrice() {
        return price;
    }

    public Library getLibrary() {
        return library;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Member getReader() {
        return member;
    }

    public void setReader(Member member) {
        this.member = member;
    }

    public Category getCategory() {
        return category;
    }



    public void setCategory(Category category) {
        this.category = category;
    }

    public static long getCurrentId() {
        return currentId;
    }

    public long getBookId() {
        return bookId;
    }

    public Member getMember() {
        return member;
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

    @Override
    public String toString() {
        return "Book{" +
                "id=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", bookStatus=" + bookStatus +
                ", price=" + price +
                ", category=" + category +
                ", reader=" + member +
                '}';
    }
}
