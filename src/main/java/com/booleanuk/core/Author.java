package com.booleanuk.core;

public class Author {
    String fullName,contactInformation,websiteURL;
    int age;

    public Author(String fullName, String contactInformation, String websiteURL, int age) {
        this.fullName = fullName;
        this.contactInformation = contactInformation;
        this.websiteURL = websiteURL;
        this.age = age;
    }
    public Author(){
        this.fullName = "N/A";
        this.contactInformation = "N/A";
        this.websiteURL = "N/A";
        this.age =0;
    }
    public Author(String fullName){
        this.fullName = fullName;
        this.contactInformation = "N/A";
        this.websiteURL = "N/A";
        this.age =0;
    }
}
