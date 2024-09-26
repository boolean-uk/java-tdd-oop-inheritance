package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Inventory book = new Book("JUnit Rocks",new Author("Dave ames", "Boolean Discord", "https://boolean.co.uk/"));
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Inventory book = new Book("JUnit Rocks",new Author("Dave ames", "Boolean Discord",
                "https://boolean.co.uk/"));
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Inventory book = new Book("JUnit Rocks", new Author("Dave ames", "Boolean Discord",
                "https://boolean.co.uk/"));
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Inventory book = new Book("JUnit Rocks",new Author("Dave ames", "Boolean Discord",
                "https://boolean.co.uk/"));

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
}
