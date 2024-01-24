package com.booleanuk.core;

public class Article extends Item {
    protected String title;
    protected Author author;
    boolean onLoan = false;

    public Article(String title) {
        super(title);
    }

    public Article(String title, Author author) {
        super(title);
        this.setAuthor(author);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
