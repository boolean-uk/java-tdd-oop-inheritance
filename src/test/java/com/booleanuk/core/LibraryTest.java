package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void testAddToStock(){
        Library library = new Library();
        library.addToStock(new Article("The fall of America"));
        Assertions.assertEquals(1,library.items.size());
        Assertions.assertEquals("The fall of America",library.items.get(0).title);
    }
    @Test
    public void testCheckOut(){
        Library library = new Library();
        library.addToStock(new Book("The song of Fire and Ice"));
        library.addToStock(new Newspaper("The Daily Planet"));
        Assertions.assertEquals("item has been checked out",library.items.get(0).checkOut());
        Assertions.assertTrue(library.items.get(0).isOnLoan());
        Assertions.assertEquals("newspapers are not available for loan",library.items.get(1).checkOut());
        Assertions.assertFalse(library.items.get(1).isOnLoan());
    }
    @Test
    public void testCheckIn(){
        Library library = new Library();
        library.addToStock(new Book("The song of Fire and Ice"));
        library.addToStock(new Newspaper("The Daily Planet"));
        library.items.get(0).checkOut();
        Assertions.assertEquals("item has been checked in",library.items.get(0).checkIn());
        Assertions.assertFalse(library.items.get(0).isOnLoan());
        Assertions.assertEquals("newspapers are not available for loan",library.items.get(1).checkIn());
        Assertions.assertFalse(library.items.get(1).isOnLoan());
    }
}
