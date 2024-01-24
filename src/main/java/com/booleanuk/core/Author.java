package com.booleanuk.core;

public class Author {
    private String author;
    public String contact;
    public String website;

    public Author(String author, String contact, String website){
        this.author = author;
        this.contact = contact;
        this.website = website;
    }

    public String getAuthor() {
        return author;
    }

    public String getContact() {
        return contact;
    }

    public String getWebsite() {
        return website;
    }
}
