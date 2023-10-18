package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
        LibraryItem item = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", item.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        LibraryItem item = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", item.checkOut());
    }
}
