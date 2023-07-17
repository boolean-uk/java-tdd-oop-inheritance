package com.booleanuk.core;

public class Article extends Wydruk{
    private Authors authors;

    public Article(String title, Authors authors) {
        super(title);
        this.authors = authors;
    }

    public Article(String title) {
        super(title);
    }


    @Override
    public String getAuthors() {
        return authors.toString();
    }
}
