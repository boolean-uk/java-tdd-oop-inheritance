package com.booleanuk.core;

public class Author {
    String name;
    String email;
    String phoneNumber;
    String website;

    public Author(String name, String email, String phoneNumber, String website) throws Exception {
        this.name = name;
        if(email.contains("@"))  this.email = email;
        else throw new Exception("Email have to contain @");
        if(phoneNumber.trim().length() == 9) this.phoneNumber = phoneNumber;
        else throw new Exception("Phone number have to contain 9 numbers");
        if(website.contains(".")) this.website = website;
        else throw new Exception("Invalid website");

    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
