package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Author a = new Author("","","");

    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks", a);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks", a);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks", a);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks", a);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void testAuthor(){
        Book book = new Book("JUnit Rocks", a);

        Assertions.assertEquals("", a.getWebsite());

        a.setWebsite("www.com");

        Assertions.assertEquals("www.com", a.getWebsite());
    }
}
