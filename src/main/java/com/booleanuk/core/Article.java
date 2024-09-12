package com.booleanuk.core;

public class Article extends ReadMaterials{
    Author author;
    public Article(String title,Author author) {
        super(title);
        this.author = author;
    }
}
