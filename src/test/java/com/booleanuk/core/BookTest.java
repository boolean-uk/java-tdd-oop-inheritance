package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BookTest {
    static Author AUTHOR;

    @BeforeAll
    static void testSetup() {
        AUTHOR = new Author("John", "123456789", "https://site.com");
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks", AUTHOR);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks", AUTHOR);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks", AUTHOR);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks", AUTHOR);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
