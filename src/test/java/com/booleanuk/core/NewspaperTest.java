package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class NewspaperTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
        ArrayList<Author> authors = new ArrayList<>(List.of(new Author("Name1", "+0000000000", "Website1"),new Author("Name2", "+0000000000", "Website2"),new Author("Name3", "+0000000000", "Website3")));
        Newspaper newspaper = new Newspaper("The Daily Java", authors);
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        ArrayList<Author> authors = new ArrayList<>(List.of(new Author("Name1", "+0000000000", "Website1"),new Author("Name2", "+0000000000", "Website2"),new Author("Name3", "+0000000000", "Website3")));
        Newspaper newspaper = new Newspaper("The Daily Java", authors);
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }
}
