package com.booleanuk.core;

public class Author {

    String name;
    String website;

    ContactInfo contactInfo;

    public Author(String name, String website,  String phoneNumber, String email) {
        this.name = name;
        this.website = website;
        this.contactInfo = new ContactInfo(phoneNumber, email);
    }

    static class ContactInfo{

        String phoneNumber;
        String email;

        ContactInfo(String phoneNumber, String email){
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        @Override
        public String toString(){
            return "Email: " + this.email
                    + "\nPhone number: " + this.phoneNumber;
        }
    }

    @Override
    public String toString(){
        return "Name: " + this.name
                + "\n" + this.contactInfo
                + "\nWebsite: " + this.website;
    }
}
