package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void shouldBeUnavailableForCheckIn() {
        Library library = new Library();
        library.addToItem(new Newspaper("hei"));
        Assertions.assertEquals(library.items.get(0).title, "hei");
    }

}
