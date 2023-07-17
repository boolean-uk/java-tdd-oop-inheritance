package com.booleanuk.core;

public class Author {
    private String name;
    private String mail;
    private String website;

    public Author(String name, String mail, String website) {
        this.name = name;
        this.mail = mail;
        this.website = website;
    }

    public String getDescription(){
        return name + " Mail: " + mail + " Website: " + website;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getWebsite() {
        return website;
    }
}
