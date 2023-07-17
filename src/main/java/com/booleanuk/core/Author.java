package com.booleanuk.core;

public class Author {
    private final String name;
    private final String contactInformation;
    private final String website;

    public Author(String name, String contactInformation, String website) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getWebsite() {
        return website;
    }
}
