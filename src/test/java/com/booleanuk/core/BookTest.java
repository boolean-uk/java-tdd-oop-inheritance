package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public  void shouldReturnAuthor() {
        Authors authors = new Authors("James", "123456789", "James.com");
        Book book = new Book("XXX", authors);
        String authorInfo = book.getAuthors();
        System.out.println(authorInfo.toString());
        Assertions.assertEquals(authors.toString(), authorInfo);



    }
}
