package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("item is not currently on loan", newspaper.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("item has been checked out", newspaper.checkOut());
    }
}
