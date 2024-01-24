package com.booleanuk.core;

public class Author {
    private String name;
    private String contactInformation;
    private String website;

    public Author(String name, String contactInformation, String website) {
        this.name = name;
        setContactInformation(contactInformation);
        setWebsite(website);
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

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
