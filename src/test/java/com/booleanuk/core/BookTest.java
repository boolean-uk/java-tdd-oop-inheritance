package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    private Book book;
    private Author author;

    @BeforeEach
    public void setUp() {
        author = new Author("J.R.R. Tolkien", "tolkien@gmail.com",
                "555-555-5555", "tolkien.com");
        book = new Book("JUnit Rocks", author);
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void testGetAuthor() {
        Assertions.assertEquals(author, book.getAuthor());
    }
}
