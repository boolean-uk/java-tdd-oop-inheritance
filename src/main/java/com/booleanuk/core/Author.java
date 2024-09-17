package com.booleanuk.core;

public class Author {
    private String name;
    private String email;
    private String website;

    public Author(String name, String email, String website){
       setName(name);
       setEmail(email);
       setWebsite(website);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return this.website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
