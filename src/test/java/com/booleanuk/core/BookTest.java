package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Author author=new Author("John Java", "694201337");
    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks",author);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks",author);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks",author);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks",author);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }

    @Test
    public void shouldGetAuthorName() {
        Book book = new Book("JUnit Rocks",author);

        Assertions.assertEquals("John Java", book.getAuthor());
    }
}
