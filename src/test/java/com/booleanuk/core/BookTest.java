package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Book book = new Book("JUnit Rocks", JUnitauthor);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Book book = new Book("JUnit Rocks", JUnitauthor);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Book book = new Book("JUnit Rocks", JUnitauthor);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Book book = new Book("JUnit Rocks", JUnitauthor);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
