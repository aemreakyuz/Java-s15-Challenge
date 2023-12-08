package com.library;

import com.library.books.*;
import com.library.employees.Librarian;
import com.library.services.Library;
import com.library.services.LibraryUi;
import com.library.users.Adult;
import com.library.users.Member;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        library.addNewBook(new Mystery("emre", "emre") );
        library.addNewBook(new Magazine("emre", "emre") );
        library.addNewBook(new Mystery("emre", "emre") );
        Member member = new Adult("EMRE") ;
        member.setCurrentMoney(25);
        library.rentBook(new StudyBook("emre", "emre"), member);
        Librarian librarian = new Librarian("emre", library);
        librarian.removeBookById(1, library);

        LibraryUi.startApp(library, member);

    }
}
