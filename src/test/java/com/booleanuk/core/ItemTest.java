package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ItemTest {
    @Test
    public void testCheckOutOK(){
    Item testItem = new Item("testItem");
    Assertions.assertEquals("item has been checked out", testItem.checkOut());
    }
    @Test
    public void testCheckOutNotOK(){
    Item testItem = new Item("testItem");
    testItem.checkOut();
    Assertions.assertEquals("item is currently on loan", testItem.checkOut());
    }
    @Test
    public void testCheckInOK() {
        Item testItem = new Item("testItem");
        Assertions.assertEquals("item is not currently on loan", testItem.checkIn());
    }
    @Test
    public void testCheckInNotOK() {
        Item testItem = new Item("testItem");
        testItem.checkOut();
        Assertions.assertEquals("item has been checked in", testItem.checkIn());
    }
}
