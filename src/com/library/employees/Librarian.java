package com.library.employees;

import com.library.books.Book;
import com.library.books.enums.BookStatus;
import com.library.books.enums.Category;

import com.library.employees.interfaces.Searching;
import com.library.services.Library;
import com.library.users.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Librarian extends Employee implements Searching {


    public Librarian(String name, Library library) {
        super(name, library);
    }

    public void showStatus(Book book) {
        System.out.println(book.getBookStatus());
    }

    public void showReader(Book book) {
        System.out.println(book.getReader());
    }

    public void addBook(Book book) {
        getLibrary().addNewBook(book);
        System.out.println(book + " is added.");
    }

    public void removeBookById(long bookId, Library library) {
        Book book = library.getBooks().get(bookId);
        if (book != null) {
            library.getBooks().remove(bookId);
            System.out.println(book + " is removed.");
        } else {
            System.out.println("Book with ID " + bookId + " could not be found");
        }
    }

    public void editBook(Book book, String name, String author, BookStatus bookStatus, Category category, Member member) {
        {
            book.setName(name);
            book.setAuthor(author);
            book.setBookStatus(bookStatus);

            book.setCategory(category);
            book.setReader(member);
        }
    }

    public void displayBooks(Library library) {
        HashMap<Long, Book> books = library.getBooks();
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println(books);
        }
    }

    public void displayBookById(long id, Library library) {
        boolean isFound = false;
        Book book = library.getBooks().get(id);
        if (book != null) {
            System.out.println(book);
            isFound = true;
        }
        if (!isFound) {
            System.out.println("Given id " + id + " is not found");
        }

    }

    public void displayBookByTitle(String title, Library library) {
        boolean isFound = false;

        Collection<Book> books = library.getBooks().values();
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(title)) {
                System.out.println(book);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Given Title " + title + " is not found");
        }
    }

    public void displayBooksByAuthor(String author, Library library) {
        boolean isFound = false;

        Collection<Book> books = library.getBooks().values();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book);
                isFound = true;
            }
        }

        if (!isFound) {
            System.out.println("Given author " + author + " is not found");
        }
    }

    public void displayBooksByCategory() {
        Category category;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Select Category:  1: StudyBooks, 2: Mystery, 3: Magazine ");
        String input = scanner.nextLine();
        switch (input) {
            case "1":
                category = Category.STUDY_BOOK;
                break;
            case "2":
                category = Category.MYSTERY;
            case "3":
                category = Category.MAGAZINE;
            default:
                System.out.println("Invalid category");
                return;
        }
        boolean found = false;


        if (!found) {
            System.out.println("No books found in Category");
        }
    }


}
