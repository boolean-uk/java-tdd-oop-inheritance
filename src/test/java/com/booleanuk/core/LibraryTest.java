package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddToStock() {
        Library library = new Library();
        library.addToStock(new Newspaper("Daily News"));
        Assertions.assertEquals("Daily News", library.readingItems.get(0).title);
    }
}
