package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks", null);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks", null);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks", null);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks", null);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
    @Test
    public void authorGetterTest() {
        Author johnTolkien = new Author("John", "tolkien@gmail.com", "tolkien.com");
        Book book = new Book("Lord of The Rings", johnTolkien);
        Assertions.assertEquals(johnTolkien, book.getAuthor());
    }
}
