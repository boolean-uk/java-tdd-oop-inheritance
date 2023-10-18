package com.booleanuk.core;

public class Article extends Writing{

    private final Author author;

    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
