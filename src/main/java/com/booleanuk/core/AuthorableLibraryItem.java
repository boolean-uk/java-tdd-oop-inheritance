package com.booleanuk.core;

public class AuthorableLibraryItem extends LibraryItem {
    private final Author author;

    public AuthorableLibraryItem(Author author, String title) {
        super(title);
        this.author = author;
    }

    public Author author() {
        return this.author;
    }
}
