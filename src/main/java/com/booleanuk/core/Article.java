package com.booleanuk.core;

public class Article extends ReadingMaterial {
    Author author;

    public Article(String title) {
        super(title);
    }

    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }

    public String getAuthorName() {
        if (author != null) {
            return "The author is " + author.getName();
        } else {
            return "This reading material has no author";
        }
    }
}
