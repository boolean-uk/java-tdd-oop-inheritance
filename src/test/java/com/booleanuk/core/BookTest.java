package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Author author1 = new Author("Pesoa", "Portugal", "pesoa.com");
    Author author2 = new Author("Deitel", "American", "deitel.com");
    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks", author2);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks", author2);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks", author2);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks", author2);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
