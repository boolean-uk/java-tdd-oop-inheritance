package com.booleanuk.core;

public class Author {
    private String name;
    private String email;

    private String website;

    public Author(String name) {
        this.name = name;
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Author(String name, String email, String website) {
        this.name = name;
        this.email = email;
        this.website = website;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
