package com.booleanuk.core;

public class Book extends Item {
    private Author author;

    public Book(String tile, Author author){
        super(tile);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
