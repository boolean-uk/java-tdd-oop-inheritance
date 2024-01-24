package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    Author author = new Author("Marit", "marit@someEmail.com", "marit.someWebsite.com");

    @Test
    public void shouldCheckOutIfAvailable() {
        Item item = new Book("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", item.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Item item = new Book("JUnit Rocks", author);
        item.checkOut();

        Assertions.assertEquals("item is currently on loan", item.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Item item = new Book("JUnit Rocks", author);
        item.checkOut();

        Assertions.assertEquals("item has been checked in", item.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Item item = new Book("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", item.checkIn());
    }
}
