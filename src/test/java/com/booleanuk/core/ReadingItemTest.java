package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReadingItemTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        ReadingItem readingItem = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", readingItem.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        ReadingItem readingItem = new Article("JUnit Rocks");
        readingItem.checkOut();

        Assertions.assertEquals("item is currently on loan", readingItem.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        ReadingItem readingItem = new Article("JUnit Rocks");
        readingItem.checkOut();

        Assertions.assertEquals("item has been checked in", readingItem.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        ReadingItem readingItem = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", readingItem.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckIn() {
        ReadingItem readingItem = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", readingItem.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        ReadingItem readingItem = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", readingItem.checkOut());
    }
}
