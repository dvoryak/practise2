package com.company.data;

import com.company.model.Book;

public class BookStorage {
    private Book[] data = new Book[100];
    private int size = 0;
    private static BookStorage instance;

    private BookStorage() {}

    public static BookStorage getInstance() {
        if(instance == null) {
            instance = new BookStorage();
        }
        return instance;
    }

    public void add(Book b) {
        data[size++] = b;
    }

    public Book[] getAllBook () {
        return data;
    }

    public int getSize() {
        return size;
    }

}
