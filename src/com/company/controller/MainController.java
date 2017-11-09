package com.company.controller;

import com.company.data.BookStorage;
import com.company.model.Book;
import com.company.service.BookPublisherComparator;
import com.company.service.ConsoleHelper;
import com.company.view.BookView;

import java.util.Arrays;

public class MainController {
    BookStorage bookStorage = BookStorage.getInstance();
    BookView view;

    public MainController(BookView view) {
        this.view = view;
    }

    public void run() {
        view.showMenu();
        while (true) {
            int x = ConsoleHelper.readInt();
            switch (x) {
                case 1: view.fireEventShowAllBooks();
                break;
                case 2: view.fireEventShowBooksByAuthor();
                break;
                case 3: view.fireEventShowBooksByPublisher();
                break;
                case 4: view.fireEventShowBooksPublishedLaterThen();
                break;
                case 5: view.fireEventShowSortedBooksByPublisher();
                break;
                case 0: System.exit(0);
            }
        }
    }

    public void onShowAllBooks() {
        view.printBooks(bookStorage.getAllBook());
        view.showMenu();
    }

    public void onShowAllBooksByAuthor(String author) {
        Book[] model = new Book[bookStorage.getSize()];
        int j = 0;
        for (int i = 0; i < bookStorage.getSize(); i++) {
            if (bookStorage.getAllBook()[i].getAuthor().trim().equalsIgnoreCase(author.trim())) {
                model[j++] = bookStorage.getAllBook()[i];
            }

        }
        view.printBooks(model);
        view.showMenu();
    }

    public void onShowAllBooksByPublisher(String publisher) {
        Book[] model = new Book[bookStorage.getSize()];
        int j = 0;
        for (int i = 0; i < bookStorage.getSize(); i++) {
            if (bookStorage.getAllBook()[i].getPublisher().trim().equalsIgnoreCase(publisher.trim())) {
                model[j++] = bookStorage.getAllBook()[i];
            }

        }
        view.printBooks(model);
        view.showMenu();
    }

    public void onShowAllBooksPublishedLaterThen(int year) {
        Book[] model = new Book[bookStorage.getSize()];
        int j = 0;
        for (int i = 0; i < bookStorage.getSize(); i++) {
            if (bookStorage.getAllBook()[i].getYear() > year) {
                model[j++] = bookStorage.getAllBook()[i];
            }

        }
        view.printBooks(model);
        view.showMenu();
    }

    public void onShowSortedBooksByPublisher() {
        Book[] model = new Book[bookStorage.getSize()];
        for (int i = 0; i < bookStorage.getSize(); i++) {
            model[i] = bookStorage.getAllBook()[i];
        }
        Arrays.sort(model,new BookPublisherComparator());
        view.printBooks(model);
        view.showMenu();
    }
}
