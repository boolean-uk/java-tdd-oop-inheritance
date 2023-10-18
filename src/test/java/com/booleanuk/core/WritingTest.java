package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WritingTest {

    Writing writing;

    @BeforeEach
    void setUp() {
        writing = new Writing("Book");
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Assertions.assertEquals("item has been checked out", writing.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        writing.checkOut();

        Assertions.assertEquals("item is currently on loan", writing.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        writing.checkOut();

        Assertions.assertEquals("item has been checked in", writing.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Assertions.assertEquals("item is not currently on loan", writing.checkIn());
    }
}
