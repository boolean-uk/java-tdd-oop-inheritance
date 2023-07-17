package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BookTest {
    static Author author;
    @BeforeAll
    public static void setUpBeforeClass() {
        author = new Author("John", "787787877", "john.com");

    }
    @Test
    public void shouldCheckOutIfAvailable() {
        LibraryItem item = new Book("JUnit Rocks", author);
        Assertions.assertEquals("Book has been checked out", item.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        LibraryItem item = new Book("JUnit Rocks", author));
        item.checkOut();

        Assertions.assertEquals("Book is currently on loan", item.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        LibraryItem item = new Book("JUnit Rocks", author));
        item.checkOut();

        Assertions.assertEquals("Book has been checked in", item.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        LibraryItem item = new Book("JUnit Rocks");

        Assertions.assertEquals("Book is not currently on loan", item.checkIn());
    }
}
