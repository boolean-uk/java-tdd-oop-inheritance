package com.booleanuk.core;

public class Article extends LibraryItem {
    Author author;

    public Article(String title) {
        super(title);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Article(String title, Author author) {

        super(title);
        this.author = author;

    }
}
