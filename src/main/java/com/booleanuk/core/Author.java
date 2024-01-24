package com.booleanuk.core;

public class Author {
    private String name;
    private String contact;
    private String website;

    public Author(String name, String contact, String website){
        this.name = name;
        this.contact = contact;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
