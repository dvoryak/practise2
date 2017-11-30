package main.java.com.company.controller;

import main.java.com.company.data.BookStorage;
import main.java.com.company.entity.Book;
import main.java.com.company.service.BookPublisherComparator;
import main.java.com.company.service.ConsoleHelper;
import main.java.com.company.view.BookView;
import org.apache.log4j.Logger;

import java.util.Arrays;

public class MainController {
    BookStorage bookStorage = BookStorage.getInstance();
    BookView view;
    static Logger logger = Logger.getLogger(MainController.class);

    public MainController(BookView view) {
        this.view = view;
    }

    public void run() {
        view.showMenu();
        while (true) {
            int x = ConsoleHelper.readInt();
            switch (x) {
                case 1: view.fireEventShowAllBooks();
                logger.info("Отобразить все книги");
                break;
                case 2: view.fireEventShowBooksByAuthor();
                logger.info("Отобразить все книги по автору");
                break;
                case 3: view.fireEventShowBooksByPublisher();
                logger.info("Отобразить все книги по издательству");
                break;
                case 4: view.fireEventShowBooksPublishedLaterThen();
                logger.info("Отобразить все книги изданые позже ");
                break;
                case 5: view.fireEventShowSortedBooksByPublisher();
                logger.info("Отобразить все книги отсортированые по издательству");
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
