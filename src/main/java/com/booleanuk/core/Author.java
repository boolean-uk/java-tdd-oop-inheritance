package com.booleanuk.core;

public class Author {
    private String name;
    private String phoneNumber;
    private String website;

    public Author(String name, String phoneNumber){
        this.name=name;
        this.phoneNumber=phoneNumber;
        website="www."+name+".com";
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }
}
