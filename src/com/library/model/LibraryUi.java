package com.library.model;

import com.library.employees.Librarian;

import java.util.Scanner;

public class LibraryUi {
    private Scanner scanner;
    private Librarian librarian;

    public LibraryUi(Librarian librarian) {
        this.scanner = new Scanner(System.in);
        this.librarian = librarian;
    }

    public void startApp(){
        System.out.println("Welcome to our Library");
        System.out.println("What would you like to do? ");
        System.out.println("1: Display Books, 2: buy books 3: return 4: Display my books ");
    }
    String input = scanner.nextLine();

}
