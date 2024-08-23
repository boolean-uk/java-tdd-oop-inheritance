package com.booleanuk.core;

public class Article extends Item{
    String title;

    boolean onLoan = false;

    public Article(String title, Author author) {
        super(title, author);
        this.type="Article";
    }


}
