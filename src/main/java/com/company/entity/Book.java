package main.java.com.company.entity;

public class Book {

    private String name;
    private String author;
    private String publisher;
    private int year;
    private int pages;
    private int price;

    private Book(Builder builder) {
        this.name = builder.name;
        this.author = builder.author;
        this.publisher = builder.publisher;
        this.year = builder.year;
        this.pages = builder.pages;
        this.price = builder.price;
    }

    public Book(String name, String author, String publisher, int year, int pages, int price) {
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
        this.price = price;
    }

    public Builder newBuilder() {
        return new Book.Builder();
    }

    public static class Builder {
        public Builder() {}
        private String name;
        private String author;
        private String publisher;
        private int year;
        private int pages;
        private int price;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(this);
        }

    }

    public String getName() {
        return name;
    }


    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }


    public int getYear() {
        return year;
    }


    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Name{").append(name).
                append("} Author{").append(author).
                    append("} Publisher{").append(publisher).
                        append("} Year{").append(year).
                            append("} Pages{").append(pages).
                                append("} Price {").append(price).append("}");
        return sb.toString();
    }
}
