package com.booleanuk.core;

import java.util.ArrayList;

public class Newspaper extends WrittenObject{
    private ArrayList<Author> authors;
    public Newspaper(String title, ArrayList<Author> authors) {
        super(title);
        this.authors = authors;
    }

    @Override
    public String checkIn() {
        return "newspapers are not available for loan";
    }
    @Override
    public String checkOut() {
        return "newspapers are not available for loan";
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(ArrayList<Author> authors) {
        this.authors = authors;
    }
}
