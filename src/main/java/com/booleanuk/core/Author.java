package com.booleanuk.core;

public class Author {
    private String name;
    private String eMail;
    private String website;

    public Author(String name, String eMail, String website) {
        this.name = name;
        this.eMail = eMail;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public String getWebsite() {
        return website;
    }
}
