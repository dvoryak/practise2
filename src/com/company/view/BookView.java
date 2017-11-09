package com.company.view;

import com.company.controller.MainController;
import com.company.entity.Book;
import com.company.service.ConsoleHelper;

public class BookView {
    MainController controller;

    public BookView() {
    }

    public void fireEventShowAllBooks() {
        controller.onShowAllBooks();
    }

    public void fireEventShowBooksByAuthor() {
        ConsoleHelper.print("Enter an author");
        String author = ConsoleHelper.readString();
        controller.onShowAllBooksByAuthor(author);
    }

    public void fireEventShowBooksByPublisher() {
        ConsoleHelper.print("Enter a publisher");
        String publisher = ConsoleHelper.readString();
        controller.onShowAllBooksByPublisher(publisher);
    }

    public void fireEventShowBooksPublishedLaterThen() {
        ConsoleHelper.print("Enter an year");
        int year = ConsoleHelper.readInt();
        controller.onShowAllBooksPublishedLaterThen(year);
    }

    public void fireEventShowSortedBooksByPublisher() {
        controller.onShowSortedBooksByPublisher();
    }


    public void printBooks(Book[] books) {
        for (Book book : books) {
            if(book != null) {
                ConsoleHelper.print(book.toString());
            }
        }
    }

    public void showMenu() {
        ConsoleHelper.print("1. Show all books");
        ConsoleHelper.print("2. Show books by author");
        ConsoleHelper.print("3. Show books by publisher");
        ConsoleHelper.print("4. Show books published later then");
        ConsoleHelper.print("5. Show books sorted by publisher");
        ConsoleHelper.print("0. Exit");
    }

    public MainController getController() {
        return controller;
    }

    public void setController(MainController controller) {
        this.controller = controller;
    }
}
