package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void libraryHasBookTest() {
        Library lib = new Library();
        Book book = new Book("Dune: Part One");
        lib.addToStock(book);
        Assertions.assertTrue(lib.items.contains(book));
    }

    @Test
    public void updateBookCheckInAndCheckOutTest() {
        Library lib = new Library();
        Book book = new Book("Dune: Part One");
        lib.addToStock(book);
        Assertions.assertEquals("item has been checked out", lib.checkOutItem(book.title));
        Assertions.assertEquals("item has been checked in", lib.checkInItem(book.title));
    }

    @Test
    public void libraryHasNewspaperTest() {
        Library lib = new Library();
        Newspaper newspaper = new Newspaper("The Guardian");
        lib.addToStock(newspaper);
        Assertions.assertTrue(lib.items.contains(newspaper));
    }

    @Test
    public void checkNewspaperLoanTest() {
        Library lib = new Library();
        Newspaper newspaper = new Newspaper("The Guardian");
        lib.addToStock(newspaper);
        Assertions.assertEquals("newspapers are not available for loan", lib.checkOutItem(newspaper.title));
        Assertions.assertEquals("newspapers are not available for loan", lib.checkInItem(newspaper.title));
    }
}
