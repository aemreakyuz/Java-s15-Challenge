package com.library.readers;

import com.library.books.Book;

import java.util.ArrayList;

public class Adult extends Reader {

    public Adult(long memberId, String name) {
        super(memberId, name);
    }

    public String toString() {
        return "Adult Member ID: " + getMemberId() +  " Name: " + getName();
    }
}
