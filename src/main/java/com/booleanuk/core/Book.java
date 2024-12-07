package com.booleanuk.core;

public class Book extends Stock {

    public Book(String title,String name,String contactInformation, String website ) {
        super(title);
        Author author = new Author(name, contactInformation, website);

    }



}
