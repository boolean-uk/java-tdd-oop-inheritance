package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    @Test
    public void shouldAddToLibrary() {
        Library library = new Library();
        Item book = new Book("JUnit Rocks");
        Item article = new Article("Mockito Rocks");
        Item newspaper = new Newspaper("The Daily Java");
        library.addToStock(book);
        library.addToStock(article);
        library.addToStock(newspaper);
        assertEquals(3, library.getItems().size());
    }

    @Test
    public void shouldCheckInAsExpected() {
        Library library = new Library();
        Item book = new Book("JUnit Rocks");
        Item newspaper = new Newspaper("The Daily Java");

        library.addToStock(book);

        assertEquals(1, library.getItems().size());
        assertEquals("item is not currently on loan", library.checkInItem("JUnit Rocks"));
        assertEquals("item is not part of the library's collection", library.checkInItem("The Daily Java"));

        library.addToStock(newspaper);

        assertEquals("newspapers are not available for loan", library.checkInItem("The Daily Java"));
    }

    @Test
    public void shouldCheckOutAsExpected() {
        Library library = new Library();
        Item book = new Book("JUnit Rocks");
        Item article = new Article("Mockito Rocks");

        library.addToStock(book);

        assertEquals(1, library.getItems().size());
        assertEquals("item has been checked out", library.checkOutItem("JUnit Rocks"));
        assertEquals("item has been checked in", library.checkInItem("JUnit Rocks"));

        library.addToStock(article);

        assertEquals("item has been checked out", library.checkOutItem("Mockito Rocks"));
        assertEquals("item is currently on loan", library.checkOutItem("Mockito Rocks"));
        assertEquals("item is not part of the library's collection", library.checkOutItem("Cracking the Coding Interview"));


    }
}
