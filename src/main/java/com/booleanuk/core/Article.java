package com.booleanuk.core;

import java.util.List;

public class Article extends LoanItem {
    private List<Author> authors;

    public Article(String title) {
        super(title);
    }

    public Article(String title, List<Author> authors) {
        super(title);
        this.authors = authors;
    }

    public List<Author> authors() {
        return this.authors;
    }
}
