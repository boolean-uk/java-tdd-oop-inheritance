package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddToStock() {
        Publication book = new Book("To Kill a Mockingbird");
        library.addToStock(book);

        Assertions.assertEquals(book.checkIn(), library.checkInPublication("To Kill a Mockingbird"));
    }

    @Test
    public void testCheckInPublication() {
        String message = library.checkInPublication("Moby Dick");

        Assertions.assertEquals("item is not part of the library's collection", message);
    }

    @Test
    public void testCheckInPublication_notInStock() {
        String message = library.checkInPublication("The Great Gatsby");

        Assertions.assertEquals("item is not part of the library's collection", message);
    }

    @Test
    public void testCheckOutPublication() {
        String message = library.checkOutPublication("1984");

        Assertions.assertEquals("item is not part of the library's collection", message);
    }

    @Test
    public void testCheckOutPublication_notInStock() {
        String message = library.checkOutPublication("The Great Gatsby");

        Assertions.assertEquals("item is not part of the library's collection", message);
    }
}
