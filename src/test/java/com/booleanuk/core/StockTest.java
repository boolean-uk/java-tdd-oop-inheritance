package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    public void shouldCheckOutIfAvailable() {
        Stock stock = new Stock("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", stock.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Stock stock = new Stock("JUnit Rocks");
        stock.checkOut();

        Assertions.assertEquals("item is currently on loan", stock.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Stock stock = new Stock("JUnit Rocks");
        stock.checkOut();

        Assertions.assertEquals("item has been checked in", stock.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Stock stock = new Stock("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", stock.checkIn());
    }
}