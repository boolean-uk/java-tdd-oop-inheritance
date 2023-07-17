package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Product book = new Book("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Product book = new Book("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Product book = new Book("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Product book = new Book("JUnit Rocks", new Author("Author 1", "contact 1", "website1"));

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
