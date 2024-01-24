package com.booleanuk.core;

public class Article extends Stock {
    public Article(String title,String name,String contactInformation, String website ) {
        super(title);
        Author author = new Author(name, contactInformation, website);
    }
}
