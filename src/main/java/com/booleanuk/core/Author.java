package com.booleanuk.core;

public class Author {
    private String name;
    private String contactInformation;
    private String website;

    public Author(String name, String contactInformation, String website) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }

    public String getName() {
        return this.name;
    }

    public String getContactInformation() {
        return this.contactInformation;
    }

    public String getWebsite() {
        return this.website;
    }
}
