package com.company.service;

import com.company.entity.Book;

import java.util.Comparator;

public class BookPublisherComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublisher().compareTo(o2.getPublisher());
    }
}
