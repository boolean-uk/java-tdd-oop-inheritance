package com.booleanuk.core;

public class Article extends LibraryItem{
    String title;
    Author author;
    boolean onLoan = false;

    public Article(String title) {
        super(title);
    }

    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

}
