package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Test
    public void shouldAddItemsToStock() {
        Document book1 = new Book("Java for Dummies: Limited Edition");
        Document article1 = new Article("Java Streams. Should we use them?");
        Document newspaper1 = new Newspaper("Programmers News");


        library.addToStock(book1);
        library.addToStock(article1);
        library.addToStock(newspaper1);

        Assertions.assertEquals(3, library.documents.size());
        Assertions.assertEquals("Programmers News", library.documents.get(2).title);
    }

    @Test
    public void checkOutShouldReturnAppropriateMessage() {
        Document book = new Book("Java for Dummies: Limited Edition");
        library.addToStock(book);

        // check out works
        String output = library.checkOutDocument(book.title);
        String expected = "item has been checked out";
        Assertions.assertEquals(expected, output);

        // already checked out
        output = library.checkOutDocument(book.title);
        expected = "item is currently on loan";
        Assertions.assertEquals(expected, output);

        // document doesn't exist
        output = library.checkOutDocument("I don't exist");
        expected = "item is not part of the library's collection";
        Assertions.assertEquals(expected, output);
    }

    @Test
    public void checkInShouldReturnAppropriateMessage() {
        Document book = new Book("Java for Dummies: Limited Edition");
        library.addToStock(book);

        // document is not checked out
        String output = library.checkInDocument(book.title);
        String expected = "item is not currently on loan";
        Assertions.assertEquals(expected, output);

        // document is checked out
        library.checkOutDocument(book.title);
        output = library.checkInDocument(book.title);
        expected = "item has been checked in";
        Assertions.assertEquals(expected, output);

        // document doesn't exist
        output = library.checkOutDocument("I don't exist");
        expected = "item is not part of the library's collection";
        Assertions.assertEquals(expected, output);
    }
}
