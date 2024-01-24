package com.booleanuk.core;

public class Author {
    private final String name;
    private final String website;
    private final String contactInformation;


    public Author(String name, String website, String contactInformation){
        this.name = name;
        this.website = website;
        this.contactInformation = contactInformation;
    }
    public String getName() {
        return name;
    }

    public String getWebsite() {
        return website;
    }

    public String getContactInformation() {
        return contactInformation;
    }


}
