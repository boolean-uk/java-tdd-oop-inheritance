package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Newspaper newspaper = new Newspaper("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", newspaper.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Newspaper newspaper = new Newspaper("JUnit Rocks");
        newspaper.checkOut();

        Assertions.assertEquals("item is currently on loan", newspaper.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Newspaper newspaper = new Newspaper("JUnit Rocks");
        newspaper.checkOut();

        Assertions.assertEquals("item has been checked in", newspaper.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Newspaper newspaper = new Newspaper("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", newspaper.checkIn());
    }
}
