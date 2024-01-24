package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Author a = new Author("", "", "");

    @Test
    public void testAdd(){
        Library library = new Library();

        Assertions.assertTrue(library.items.isEmpty());

        library.addToStock(new Article("Funny Article", a));

        Assertions.assertFalse(library.items.get(0).isOnLoan());
        Assertions.assertEquals(1, library.items.size());

        library.addToStock(new Article("Sad Article", a));

        Assertions.assertFalse(library.items.get(1).isOnLoan());
        Assertions.assertEquals(2, library.items.size());
    }

    @Test
    public void testCheckOutAndCheckIn() {
        Library library = new Library();

        library.addToStock(new Article("Cool Article", a));
        library.addToStock(new Book("Cool Book", a));
        library.addToStock((new Newspaper("Cool Newspaper")));

        for (Item item : library.items) {
            Assertions.assertFalse(item.isOnLoan());
        }

        library.checkOutItem("Cool Article");
        library.checkOutItem("Cool Book");
        library.checkOutItem("Cool Newspaper");

        Assertions.assertTrue(library.items.get(0).isOnLoan());
        Assertions.assertTrue(library.items.get(1).isOnLoan());
        Assertions.assertFalse(library.items.get(2).isOnLoan());

        library.checkInItem("Cool Article");
        library.checkInItem("Cool Book");
        library.checkInItem("Cool Newspaper");

        for (Item item : library.items) {
            Assertions.assertFalse(item.isOnLoan());
        }
    }
}
