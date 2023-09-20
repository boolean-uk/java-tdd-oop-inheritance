package com.booleanuk.core;

public class Article extends LibraryItem{
    private final Author author;

    public Article(String title) {
        super(title);
        this.author = null;
    }

    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
