package com.booleanuk.core;

public class Author {
    private final String name;
    private final String phoneNumber;
    private final String email;
    private final String website;

    public Author(String name, String phoneNumber, String email, String website){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getWebsite() {
        return website;
    }
}
