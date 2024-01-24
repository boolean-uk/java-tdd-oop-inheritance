package com.booleanuk.core;

public class Book extends Item {
    Author author;
    public Book(String title, Author author)
    {
        super(title);
        this.author = author;
    }

    public String getAuthor()
    {
        return author.getAuthorName();
    }

    public String getContactInfo()
    {
        return author.getContactInfo();
    }

    public String getWebsite()
    {
        return author.getWebsite();
    }
}
