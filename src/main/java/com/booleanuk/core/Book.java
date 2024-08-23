package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Book extends LoanItem {
    private List<Author> authors;

    public Book(String title) {
        this(title, new ArrayList<>());
    }

    public Book(String title, List<Author> authors) {
        super(title);
        this.authors = authors;
    }

    public List<Author> authors() {
        return this.authors;
    }
}
