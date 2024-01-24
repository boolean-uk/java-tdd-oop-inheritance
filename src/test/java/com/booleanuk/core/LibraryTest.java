package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void testIfMaterialGetsAddedToStock() {
        Library library = new Library();
        Book book = new Book("Harry Potter");

        Assertions.assertEquals(0, library.type.size());

        library.addToStock(book);

        Assertions.assertEquals(1, library.type.size());
    }

    @Test
    public void testingCheckInAndCheckOutMethods() {
        Library library = new Library();
        Book book = new Book("Harry Potter");

        Assertions.assertEquals(0, library.type.size());

        library.addToStock(book);

        Assertions.assertEquals(1, library.type.size());

        Assertions.assertEquals(false, book.isOnLoan());

        Assertions.assertEquals("item has been checked out", library.checkOutMaterial(book));

        Assertions.assertEquals(true, book.isOnLoan());

        Assertions.assertEquals("item has been checked in", library.checkInMaterial(book));

        Assertions.assertEquals(false, book.isOnLoan());
    }
}
