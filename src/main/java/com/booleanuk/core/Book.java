package com.booleanuk.core;

public class Book extends LibraryItem{
    String title;

    boolean onLoan = false;

    public Book(String title){
        super(title);
    }


}
