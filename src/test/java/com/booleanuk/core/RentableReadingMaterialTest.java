package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RentableReadingMaterialTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Book book = new Book("JUnit Rocks");
        Assertions.assertEquals("Item has been checked out.", book.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Book book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("Item is currently on loan.", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Book book = new Book("JUnit Rocks");
        book.checkOut();

        Assertions.assertEquals("Item has been checked in.", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Book book = new Book("JUnit Rocks");

        Assertions.assertEquals("Item is not currently on loan.", book.checkIn());
    }
}
