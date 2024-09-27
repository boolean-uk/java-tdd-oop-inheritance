package com.booleanuk.core;

public class Author {
    String name;
    String contactInfo;
    String website;
    public Author(String name, String contactInfo, String website) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
