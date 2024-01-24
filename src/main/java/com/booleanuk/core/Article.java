package com.booleanuk.core;

public class Article extends Items{


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
            return author.getName();
        }

        return "We have nothing";
    }





}
