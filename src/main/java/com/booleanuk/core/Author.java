package com.booleanuk.core;

public class Author {
    String name;
    String email;
    String website;

    public Author(String name, String email, String website) {
        this.name = name;
        this.email = email;
        this.website = website;
    }

    public String getName() {
        return this.name;
    }
}
