package com.library;

import com.library.books.*;
import com.library.books.enums.BookStatus;
import com.library.books.enums.Category;
import com.library.employees.Employee;
import com.library.employees.Librarian;
import com.library.financial.Invoice;
import com.library.model.Library;
import com.library.readers.Adult;
import com.library.readers.Blind;
import com.library.readers.Reader;
import com.library.readers.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Scanner-----");



        System.out.println("-----Books------");
        Book magazine1 = new Magazine(1,"men's health", "JJ");
        Book magazine11 = new Magazine(7,"men's health", "JJ");
        Magazine magazine2 = new Magazine(2,"women's health", "JJ");
        Book magazine3 = new Magazine(3,"dog's health", "JJ");
        StudyBook magazine4 = new StudyBook(4,"cat's health", "JJ");
        Magazine magazine5 = new Magazine(5,"spider's health", "JJ");
        Book magazine6 = new Magazine(6,"rabbit's health", "JJ");

        System.out.println("-------Reader-------");
        Reader reader1 = new Adult(1, "Emre");
        Reader reader2 = new Blind(2, "Mehmet");
        Reader reader3 = new Student(3, "Mahmut");

        System.out.println(reader1.getName());
        System.out.println(reader1);

        System.out.println("------Library-------");
        var books = new ArrayList<Book>();
        var readers = new ArrayList<Reader>();
        var invoices = new ArrayList<Invoice>();

        Library library = new Library(books, readers, invoices);
        library.addNewBook(magazine1);
        library.addNewBook(magazine2);
        library.addNewBook(magazine3);
        library.addNewBook(magazine4);
        library.addNewBook(magazine5);
        library.addNewBook(magazine6);
        library.addNewBook(magazine11);

        books = library.getBooks();
        System.out.println(books);



        System.out.println("-----Librarian-------");
        Librarian librarian = new Librarian(library);

        System.out.println("------add/removeBook-----");
        librarian.addBook(new Magazine (1, "emre", "emre"));


        System.out.println("------purchase/returnBook------");
        librarian.assistPurchase(reader1, magazine2);
        librarian.assistPurchase(reader1, magazine1);
        System.out.println(readers);

        System.out.println("------displayBooks-----");
        librarian.displayBookByAuthor("JJ");
        librarian.displayBookByTitle("NUTUK");
        librarian.displayBookById(2);
        librarian.displayBooksByCategory();

    }
}
