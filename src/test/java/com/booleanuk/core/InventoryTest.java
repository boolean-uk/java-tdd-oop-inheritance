package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InventoryTest {

    @Test
    public void testInventoryCheckOut(){
        Inventory inventory = new Inventory("Moby dick");
        Inventory article = new Article("Medicine advancements");
        Assertions.assertEquals("item has been checked out",inventory.checkOut());
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void testInventoryCheckOutFail(){
        Inventory book = new Book("Moby dick");
        Inventory article = new Article("");
        Inventory newspaper = new Newspaper("New York Times");
        book.checkOut();
        article.checkOut();
        newspaper.checkOut();
        Assertions.assertEquals("item is currently on loan",book.checkOut());
        Assertions.assertEquals("item is currently on loan", article.checkOut());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Inventory article = new Article("JUnit Rocks");
        Inventory book = new Book("Moby Dick");
        Inventory newspaper = new Newspaper("Medicine advancements");
        article.checkOut();
        book.checkOut();
        newspaper.checkOut();
        Assertions.assertEquals("item has been checked in", article.checkIn());
        Assertions.assertEquals("item has been checked in", book.checkIn());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Inventory article = new Article("JUnit Rocks");
        Inventory book = new Book("Moby Dick");
        Inventory newspaper = new Newspaper("Medicine advancements");
        Assertions.assertEquals("item is not currently on loan", article.checkIn());
        Assertions.assertEquals("item is not currently on loan", book.checkIn());
        Assertions.assertEquals("newspapers are not available for loan", newspaper.checkIn());

    }
}
