package com.library.readers;

import com.library.books.Book;
import com.library.books.enums.BookStatus;

import java.util.ArrayList;
import java.util.List;

public abstract class Reader {
    private long memberId;
    private String name;
    private ArrayList<Book> purchasedBooks;

    public Reader(long memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.purchasedBooks = new ArrayList<>();
    }


    public long getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getPurchasedBooks() {
        return purchasedBooks;
    }

    public String toString() {
        return "Reader{" +
                "memberId=" + memberId +
                ", name='" + name + '\'' +
                '}';
    }
}
