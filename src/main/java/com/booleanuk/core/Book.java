package com.booleanuk.core;

public class Book extends Product {

    private Author author;

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public String getAuthorName() {
        return author.getName();
    }


    public String getAuthorContactInfo() {
        return author.getContactInfo();
    }


    public String getAuthorWebsite() {
        return author.getWebsite();
    }

}
