package com.booleanuk.core;

public class Author {
    private String name;
    private String phoneNumber;
    private String websiteURL;

    public Author(String name, String phoneNumber, String websiteURL) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.websiteURL = websiteURL;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getWebsiteURL() {
        return websiteURL;
    }
}
