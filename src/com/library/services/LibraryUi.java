package com.library.services;

import com.library.books.Book;
import com.library.books.Magazine;
import com.library.books.Mystery;
import com.library.books.enums.Category;
import com.library.employees.Librarian;
import com.library.users.Member;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class LibraryUi {

    public static void startApp(Library library, Member member){

        Librarian librarian = library.getLibrarian();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Library");
        System.out.println("What would you like to do? ");

        while(true) {

            System.out.println("1: Display Books, 2: buy books 3: return book 4: Display my books, 5: Display my invoices ");
            String input = scanner.nextLine();

            switch(input){
                case "1":

                    librarian.displayBooks(library);
                   break;

                case "2":
                    System.out.println("Please select a book by its title");

                    String bookTitle = scanner.nextLine();
                    librarian.displayBookByTitle(bookTitle, library);

                    long bookId = scanner.nextLong();
                    scanner.nextLine();
                    Book bookToRent = library.getBooks().get(bookId);

                    if(bookToRent!= null && bookToRent.getName().equalsIgnoreCase(bookTitle)){
                        library.rentBook(bookToRent, member);
                    }
                    else{
                        System.out.println("Book not found");
                    }

                    break;
                case "3":
                    System.out.println(library.getBooks());
                    break;
                case "4":
                    System.out.println(library.getBooks());
                    break;
                case "5":
                    System.out.println(member.getInvoices());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }


}
