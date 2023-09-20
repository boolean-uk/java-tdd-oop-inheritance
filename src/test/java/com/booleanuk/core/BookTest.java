package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        LibraryItem book = new Book("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        LibraryItem book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        LibraryItem book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        LibraryItem book = new Book("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void shouldGetAuthor() {
        Author author = new Author("SomeName", "SomeEmail", "SomeWebsite");
        Book book = new Book("JUnit Rocks", author);
        Assertions.assertEquals(author, book.getAuthor());
    }

    @Test
    public void shouldGetNullWhenAuthorUnspecified() {
        Book book = new Book("JUnit Rocks");
        Assertions.assertNull(book.getAuthor());
    }
}
