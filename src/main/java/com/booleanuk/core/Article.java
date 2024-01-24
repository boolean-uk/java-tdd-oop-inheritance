package com.booleanuk.core;

public class Article extends WrittenObject{
    private Author author;
    public Article(String title, Author author) {
        super(title);
        this.author = author;
    }
}
