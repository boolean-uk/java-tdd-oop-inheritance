package com.booleanuk.core;

public class Author {

    /* Books and Articles should both hold information about their authors (name, contact information, website). Newspapers should not have this information as they are written by multiple people.

Introduce this new functionality with an Author class, and use composition (dependency injection) rather than inheritance to complete it.

You must create useful tests / update the necessary existing ones.

As an end result, this repository should contain a complete solution that uses both inheritance and composition together.

     */

    private String name;
    private String contactInformation;
    private String website;

    public Author(String name, String contactInformation, String website) {
        this.name = name;
        this.contactInformation = contactInformation;
        this.website = website;
    }
    public String getName() {
        return name;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public String getWebsite() {
        return website;
    }
}
