package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author a1 = new Author("A. L. Ian");
        Book book = new Book("JUnit Rocks",a1);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author a1 = new Author("A. L. Ian");
        Book book = new Book("JUnit Rocks",a1);
      ;
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author a1 = new Author("A. L. Ian");
        Book book = new Book("JUnit Rocks",a1);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author a1 = new Author("A. L. Ian");
        Book book = new Book("JUnit Rocks",a1);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
