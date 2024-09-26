package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
       Inventory newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        Inventory newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }
}
