package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WrittenObjectTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        WrittenObject writtenObject = new WrittenObject("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", writtenObject.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        WrittenObject writtenObject = new WrittenObject("JUnit Rocks");
        writtenObject.checkOut();

        Assertions.assertEquals("item is currently on loan", writtenObject.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        WrittenObject writtenObject = new WrittenObject("JUnit Rocks");
        writtenObject.checkOut();

        Assertions.assertEquals("item has been checked in", writtenObject.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        WrittenObject writtenObject = new WrittenObject("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", writtenObject.checkIn());
    }
}
