package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testAddingCheckInCheckOut(){
        Library library = new Library();
        Book book = new Book("Lord of the flies");

        //Check in item not in collection
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Lord of the flies"));

        //Check out item not in collection
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Lord of the flies"));

        library.addToStock(book);
        //Check out item in collection

        Assertions.assertEquals("item has been checked out", library.checkOutItem("Lord of the flies"));

        //Check in item in collection

        Assertions.assertEquals("item has been checked in", library.checkInItem("Lord of the flies"));
    }
}