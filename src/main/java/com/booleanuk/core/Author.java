package com.booleanuk.core;

public class Author {
    String name, contactInfo, website;

    public Author(String name, String contactInfo, String website) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.website = website;
    }

    public String getName() {
        return name;
    }
}
