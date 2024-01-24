package com.booleanuk.core;

public class Author {
    private String name;
    private String contactInfo;
    private String webPage;


    public Author(String name, String contactInfo, String webPage) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.webPage = webPage;
    }

    public String getName() {
        return name;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public String getWebPage() {
        return webPage;
    }
}
