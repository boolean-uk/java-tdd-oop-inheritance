package com.booleanuk.core;

public class Book extends Items{


    Author author;

    public Book(String title) {
        super(title);

    }
    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public String getAuthorName() {

        if (author != null) {
            return author.getName();
        }

         return "We have nothing";
    }





}
