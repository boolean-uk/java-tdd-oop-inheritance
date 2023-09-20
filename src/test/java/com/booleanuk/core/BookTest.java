package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    private Book book;

    @BeforeEach
    public void setUp() {
        Author author = new Author("Petros", "123456", "www.some.com");
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
    public void testGetAuthorsContactInfo() {
        Assertions.assertEquals("123456", book.getAuthorContactInfo());
    }
}
