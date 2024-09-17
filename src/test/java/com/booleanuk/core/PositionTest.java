package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PositionTest {

    @Test
    public void shouldCheckOutIfAvailable() {
        Position item = new Position("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", item.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Position item = new Position("JUnit Rocks");
        item.checkOut();

        Assertions.assertEquals("item is currently on loan", item.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Position item = new Position("JUnit Rocks");
        item.checkOut();

        Assertions.assertEquals("item has been checked in", item.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Position item = new Position("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", item.checkIn());
    }
}
