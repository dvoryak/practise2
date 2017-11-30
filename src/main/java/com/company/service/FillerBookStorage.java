package main.java.com.company.service;

import main.java.com.company.data.BookStorage;
import main.java.com.company.entity.Book;

public class FillerBookStorage {
    BookStorage storage = BookStorage.getInstance();

    public void fill() {
        storage.add(new Book.Builder().setAuthor("Sam Newman").setName("Building Microservices ").setPages(411)
            .setYear(2017).setPublisher("O'Reilly Media, Inc.").setPrice(250).build());

        storage.add(new Book.Builder().setAuthor("Wee Lok ").setName("Architecting for Scale ").setPages(223)
                .setYear(2016).setPublisher("O'Reilly Media, Inc.").setPrice(280).build());

        storage.add(new Book.Builder().setAuthor("P.T. Michelle ").setName("Ethan (Brightest Kind of Darkness: Prequel)").setPages(553)
                .setYear(2013).setPublisher("Limitless Ink Press.").setPrice(190).build());

        storage.add(new Book.Builder().setAuthor("Brus Lee ").setName("Teach Yourself Chess").setPages(533)
                .setYear(2016).setPublisher("Some Inc.").setPrice(140).build());

        storage.add(new Book.Builder().setAuthor("Jennifer McLagan ").setName("Bitter – A Taste of the World's Most Dangerous Flavor, with Recipes ").setPages(333)
                .setYear(2015).setPublisher("Ten Speed Press").setPrice(437).build());

        storage.add(new Book.Builder().setAuthor("William Irwin").setName("The Ultimate Harry Potter and Philosophy – Hogwarts for Muggles ").setPages(333)
                .setYear(2016).setPublisher("John Wiley & Sons").setPrice(400).build());

        storage.add(new Book.Builder().setAuthor("John").setName("Some Book").setPages(334)
                .setYear(2017).setPublisher("Ababab, Inc.").setPrice(420).build());

        storage.add(new Book.Builder().setAuthor("Lee Atchison ").setName("Architecting for Scale ").setPages(543)
                .setYear(2016).setPublisher("O'Reilly Media, Inc.").setPrice(500).build());
    }
}
