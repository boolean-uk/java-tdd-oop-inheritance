package com.booleanuk.core;

public class Author {
    private final String name;
    private final String contactInfo;
    private final String website;

    public Author(String name, String contactInfo, String website) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.website = website;
    }

    public String getName() {
        return name.isEmpty() ? "Unknown" : name;
    }

    public String getContactInfo() {
        return name.isEmpty() ? "Unknown" : contactInfo;
    }

    public String getWebsite() {
        return website.isEmpty() ? "Unknown" : website;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, contactInfo, website);
    }
}
