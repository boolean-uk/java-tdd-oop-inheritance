package com.booleanuk.core;

public class Article extends Item  {
    private  Author author;
    public Article(String title) {
        super(title);
        this.author = null;
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
