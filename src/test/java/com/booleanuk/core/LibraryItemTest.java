package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryItemTest {
    @Test
    public void shouldCheckOutItemIfAvailable() {
        LibraryItem article = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());

        LibraryItem book = new Book("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        LibraryItem article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());

        LibraryItem book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        LibraryItem article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());

        LibraryItem book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        LibraryItem article = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());

        LibraryItem book = new Book("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}