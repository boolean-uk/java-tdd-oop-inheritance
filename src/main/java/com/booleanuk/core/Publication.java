package com.booleanuk.core;

public class Publication extends LibraryItem{

    Author author;

    public Publication(String title,Author author){
        super(title);
        this.author = author;
    }

    public Publication(String title){
        super(title);
    }

    @Override
    public String getDescription(){
        return getTitle() + " Written by: " + getAuthor().getName();
    }

    @Override
    public String authorInformation(){
        return author.getDescription();
    }

    public Author getAuthor() {
        return author;
    }
}
