package com.booleanuk.core;

import com.booleanuk.core.example.Item;

public class Article extends Author {


    public Article(String title){
        super(title);
    }
    public Article(String title,String authorName,String authorContact,String authorWebsite) {
        super(title,authorName,authorContact,authorWebsite);
    }
}
