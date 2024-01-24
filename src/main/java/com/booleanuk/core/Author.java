package com.booleanuk.core;

public class Author {
    String name;
    String contactInformation;
    String website;
    public Author(String name, String contactInformation, String website)
    {
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }

    public Author(String name)
    {
        this.name = name;
        this.contactInformation = "";
        this.website = "";
    }

    public String getAuthorName()
    {
        return this.name;
    }

    public String getContactInfo()
    {
        return this.contactInformation;
    }

    public String getWebsite()
    {
        return this.website;
    }
}
