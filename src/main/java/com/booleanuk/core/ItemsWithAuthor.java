package com.booleanuk.core;

public abstract class ItemsWithAuthor extends Item{

    private Author author;

    public ItemsWithAuthor(String title) {
        super(title);
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
