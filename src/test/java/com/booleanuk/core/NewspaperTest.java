package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }

    @Test
    public void shouldReturnInfoAboutMissingAuthor() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        String expected = "item does not have information about author(s)";
        Assertions.assertEquals(expected, newspaper.getAuthor());
    }
}
