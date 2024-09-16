package com.booleanuk.core;

public class Article extends Publication {

    public Article(String title) {
        super(title);
    }

    public Article(String title, Author author){
        super(title, author);
    }
}
