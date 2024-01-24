package com.booleanuk.core;

public class Article extends Item {

    public Article(String title, Author author) {
        super(title);
        super.author = author;
    }
}
