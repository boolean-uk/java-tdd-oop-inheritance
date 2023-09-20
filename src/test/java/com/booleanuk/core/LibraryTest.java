package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void shouldAddToStock() {
        Library library = new Library();
        LibraryItem article = new Article("JUnit Rocks");
        library.addToStock(article);
        Assertions.assertEquals(1,library.libraryItems.size());
        LibraryItem book = new Book("Java Fundamentals");
        library.addToStock(book);
        Assertions.assertEquals(2,library.libraryItems.size());
        LibraryItem newspaper = new Newspaper("The Daily Java");
        library.addToStock(newspaper);
        Assertions.assertEquals(3,library.libraryItems.size());
    }

    @Test
    public void shouldNotCheckInWhenNotOnLoan() {
        Library library = new Library();
        LibraryItem article = new Article("JUnit Rocks");
        library.addToStock(article);
        String expected = "item is not currently on loan";
        Assertions.assertEquals(expected, library.checkInLibraryItem("JUnit Rocks"));
    }

    @Test
    public void shouldNotCheckInNonExistingItem() {
        Library library = new Library();
        String expected = "item is not part of the library's collection";
        Assertions.assertEquals(expected, library.checkInLibraryItem("JUnit Rocks"));
    }

    @Test
    public void shouldCheckOutItemNotOnLoan() {
        Library library = new Library();
        LibraryItem article = new Article("JUnit Rocks");
        library.addToStock(article);
        String expected = "item has been checked out";
        Assertions.assertEquals(expected, library.checkOutLibraryItem("JUnit Rocks"));
    }

    @Test
    public void shouldNotCheckOutNonExistingItem() {
        Library library = new Library();
        String expected = "item is not part of the library's collection";
        Assertions.assertEquals(expected, library.checkOutLibraryItem("JUnit Rocks"));
    }

    @Test
    public void shouldNotCheckOutItemOnLoadAlready() {
        Library library = new Library();
        LibraryItem article = new Article("JUnit Rocks");
        library.addToStock(article);
        String expected = "item has been checked out";
        Assertions.assertEquals(expected, library.checkOutLibraryItem("JUnit Rocks"));
        expected = "item is currently on loan";
        Assertions.assertEquals(expected, library.checkOutLibraryItem("JUnit Rocks"));
    }

    @Test
    public void shouldCheckInWhenOnLoad() {
        Library library = new Library();
        LibraryItem article = new Article("JUnit Rocks");
        library.addToStock(article);
        String expected = "item has been checked out";
        Assertions.assertEquals(expected, library.checkOutLibraryItem("JUnit Rocks"));
        expected = "item has been checked in";
        Assertions.assertEquals(expected, library.checkInLibraryItem("JUnit Rocks"));
    }

    @Test
    public void shouldNotCheckOutCheckInNewspapers() {
        Library library = new Library();
        LibraryItem newspaper = new Newspaper("The Daily Java");
        library.addToStock(newspaper);
        String expected = "newspapers are not available for loan";
        Assertions.assertEquals(expected, library.checkOutLibraryItem("The Daily Java"));
        Assertions.assertEquals(expected, library.checkInLibraryItem("The Daily Java"));
    }
}
