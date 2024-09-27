package com.booleanuk.core;

public class Book extends ReadingMaterial {
    Author author;

    public Book(String title) {
        super(title);
    }

    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

    public String getName() {
        if (author != null) {
            return "The author is " + author.getName();
        } else {
            return "This reading material has no author";
        }
    }
}
