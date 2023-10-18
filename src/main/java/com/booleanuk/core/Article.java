package com.booleanuk.core;

public class Article extends InformationSource {

    private Author author;

    public Article(String title) {
        super(title);

    }
    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return author;
    }
}
