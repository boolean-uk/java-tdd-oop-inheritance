package com.booleanuk.core;

public class Book extends Item {
    private Author author;

    public String getAuthorInformation() {
        if(author != null){
            return "Author: " + author.getName() +
                    "\nContact Information: " + author.getContactInformation() +
                    "\nWebsite: " + author.getWebsite();
        }
        else{
            return "No author information added";
        }

    }

    public Book(String title){
        super(title);
    }
    public Book(String title, Author author) {
        super(title);
        this.author = author;
    }

}
