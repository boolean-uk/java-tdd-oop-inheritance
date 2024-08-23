package com.booleanuk.core;

public abstract class LibraryEntryAuthor extends LibraryEntry {

    private final Author author;

    public LibraryEntryAuthor(String title, Author author) {
        super(title);
        this.author = author;
    }

    public Author getAuthor() {
        return this.author;
    }

}
