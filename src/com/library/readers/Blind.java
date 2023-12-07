package com.library.readers;

import com.library.books.AudioBook;
import com.library.books.Book;


public class Blind extends Reader {

    public Blind(long memberId, String name) {
        super(memberId, name);
    }

    public String toString() {
        return "Blind Member ID: " + getMemberId() +  " Name: " + getName();
    }

    public boolean purchaseBook(Book book){
        if(book instanceof AudioBook){

            return true;
        }
        else{
            System.out.println("This book is not an audiobook, please select another");
            return false;
        }
    }
}
