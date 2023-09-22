package com.booleanuk.core;

public class Author {
    protected String name;
    protected String contactInfo;
    protected String website;

    public Author (String name, String contactInfo, String website) {
        this.setName(name);
        this.setContactInfo(contactInfo);
        this.setWebsite(website);
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
