package com.booleanuk.core;

import com.booleanuk.core.example.Item;

public class Author extends Item {
    String name;
    String contact;
    String website;

    public Author(String title,String name,String contact,String website) {
        super(title);
        this.name = name;
        this.contact = contact;
        this.website = website;
    }

    public Author(String title){
        super(title);
    }

}
