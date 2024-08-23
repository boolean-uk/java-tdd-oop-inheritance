package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author2 = new Author("name", "email@gamil.com", "website.com");
        Book book = new Book("JUnit Rocks", author2);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author2 = new Author("name", "email@gamil.com", "website.com");
        Book book = new Book("JUnit Rocks", author2);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author2 = new Author("name", "email@gamil.com", "website.com");
        Book book = new Book("JUnit Rocks", author2);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author2 = new Author("name", "email@gamil.com", "website.com");
        Book book = new Book("JUnit Rocks", author2);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
