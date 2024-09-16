package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    Library library;

    @BeforeEach
    void beforeEach() {
        Writing writing = new Writing("Book");
        library = new Library();
        library.addToStock(writing);
    }

    @Test
    void shouldBeUnavailableForCheckIn() {
        Assertions.assertEquals("item is not part of the library's collection", library.checkIn("Boook"));
    }

    @Test
    void shouldBeAvailableForCheckOut() {
        Assertions.assertEquals("item has been checked out", library.checkOut("Book"));
    }
}
