package com.booleanuk.core;

public class Article extends Literature{

    private Author author;

    public Article(String title) {
        super(title);
    }

    public Author getAuthor() {
        return this.author;
    }

    public void addAuthor(Author author) {
        this.author = author;
    }
}
