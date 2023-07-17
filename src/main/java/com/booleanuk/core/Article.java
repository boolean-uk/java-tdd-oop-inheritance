package com.booleanuk.core;

public class Article extends Item{
    private final Author author;
    public Author getAuthor() {
        return author;
    }
    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }
}
