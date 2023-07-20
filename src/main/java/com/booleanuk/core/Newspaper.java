package com.booleanuk.core;

import java.util.Arrays;
import java.util.List;

public class Newspaper extends LibraryItem{
    private final List<Author> authors;

    public Newspaper(String title, Author... authors) {
        super(title);
        this.title = title;
        this.authors= Arrays.asList(authors);
    }

    @Override
    public String checkIn() {
        return "newspapers are not available for loan";
    }

    @Override
    public String checkOut() {
        return "newspapers are not available for loan";
    }
}
