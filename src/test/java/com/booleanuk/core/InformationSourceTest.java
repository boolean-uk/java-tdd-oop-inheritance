package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InformationSourceTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        InformationSource source = new InformationSource("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", source.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        InformationSource source = new InformationSource("JUnit Rocks");
        source.checkOut();

        Assertions.assertEquals("item is currently on loan", source.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        InformationSource source = new InformationSource("JUnit Rocks");
        source.checkOut();

        Assertions.assertEquals("item has been checked in", source.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        InformationSource source = new InformationSource("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", source.checkIn());
    }
}
