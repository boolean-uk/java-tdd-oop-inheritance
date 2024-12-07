package com.booleanuk.core;

public class Author {

    private String name;
    private String phonenumber;
    private String website;
    public Author(String name, String phonenumber, String website) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.website = website;
    }

    public String getName() {
        return this.name;
    }

    public String getPhonenumber() {
        return this.phonenumber;
    }

    public String getWebsite() {
        return this.website;
    }
}
