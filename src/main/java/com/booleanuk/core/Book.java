package com.booleanuk.core;

public class Book extends Wydruk{
    private Authors authors;

    public Book(String title, Authors authors) {
        super(title);
        this.authors = authors;
    }

    public Book(String title) {
        super(title);

    }

    @Override
    public String getAuthors() {
        return authors.toString();
    }

}
