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

    @Test
    public void testCheckInOutReadingItem() {
        Library library = new Library();

        //Test newspapers for loan
        library.addToStock(new Newspaper("Daily News"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkInReadingItem("Daily News"));

        //Test for checking in book that is not on loan
        library.addToStock(new Book("Harry Potter"));
        Assertions.assertEquals("item is not currently on loan", library.checkInReadingItem("Harry Potter"));

        //Test for checking out book that is not on loan
        Assertions.assertEquals("item has been checked out", library.checkOutReadingItem("Harry Potter"));

        //Test for checking out book that is on loan
        Assertions.assertEquals("item is currently on loan", library.checkOutReadingItem("Harry Potter"));

        //Test for checking in book that is on loan
        Assertions.assertEquals("item has been checked in", library.checkInReadingItem("Harry Potter"));

        //Test for checking in book that is not in the collection
        Assertions.assertEquals("item is not part of the library's collection", library.checkInReadingItem("Harry Potter 2"));

        //Test for checking out book that is not in the collection
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutReadingItem("Harry Potter 2"));

    }

}
