package com.booleanuk.core;

import com.booleanuk.core.example.Item;

public class Book extends Author {
    public Book(String title) {
        super(title);
    }
    public Book(String title,String authorName,String authorContact,String authorWebsite) {
        super(title,authorName,authorContact,authorWebsite);
    }
}
