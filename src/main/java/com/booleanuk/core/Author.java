package com.booleanuk.core;

public class Author {
    String name;
    String email;
    String phoneNumber;
    String website;

    public Author(String name, String email, String phoneNumber, String website) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsite() {
        return website;
    }
}
