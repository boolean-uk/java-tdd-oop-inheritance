package com.booleanuk.core;

public class Author {
    private String name;
    private String contactInformation;
    private String webSite;

    public Author(String name, String contactInformation, String webSite) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.webSite = webSite;
    }

    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getWebSite() {
        return webSite;
    }
}
