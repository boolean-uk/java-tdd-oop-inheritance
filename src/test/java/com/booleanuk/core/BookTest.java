package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BookTest {

    Author author;

    @BeforeEach
    void setUp() {
        author = new Author("Bob", "12345678", "bobsbagels.com");
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void shouldReturnBooksAuthor() {
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("Bob", book.getAuthor().getName());
    }
}
