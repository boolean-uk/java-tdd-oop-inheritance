package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentableReadingMaterialTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Book book = new Book("JUnit Rocks", author);
        Assertions.assertEquals("Item has been checked out.", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Book book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("Item is currently on loan.", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Book book = new Book("JUnit Rocks", author);
        book.checkOut();

        Assertions.assertEquals("Item has been checked in.", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        Book book = new Book("JUnit Rocks", author);

        Assertions.assertEquals("Item is not currently on loan.", book.checkIn());
    }
}
