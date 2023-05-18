package com.booleanuk.core;

public class Article extends Item{

    public Article(String title, Author author){
        super(title);
        this.setAuthor(author);
    }

}
