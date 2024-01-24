package com.booleanuk.core;

public class Author {
    private String name;
    private String website;
    private String phonenumber;

    public Author(String name, String website, String phonenumber){
        this.name = name;
        this.website = website;
        this.phonenumber = phonenumber;


    }

    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getPhonenumber() {
        return phonenumber;
    }
}


