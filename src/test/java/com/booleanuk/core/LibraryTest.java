package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class LibraryTest {

    @Test
    public void shouldCheckInIfAvailable(){
        Library newLibrary = new Library();
        LibraryItem newItem = new LibraryItem("New Article");
        LibraryItem newItem2 = new LibraryItem("New Book");
        LibraryItem newItem3 = new LibraryItem("New Newspaper");


        newLibrary.addToStock(newItem);
        newLibrary.addToStock(newItem2);

        Assertions.assertEquals("item is not currently on loan", newLibrary.checkInLibraryItems("New Article"));

    }

    @Test
    public void shouldCheckOutIfAvailable(){
        Library newLibrary = new Library();
        LibraryItem newItem = new LibraryItem("New Article");
        LibraryItem newItem2 = new LibraryItem("New Book");
        LibraryItem newItem3 = new LibraryItem("New Newspaper");


        newLibrary.addToStock(newItem);
        newLibrary.addToStock(newItem2);
        Assertions.assertEquals("item is not part of the library's collection", newLibrary.checkOutLibraryItems("New Newspaper"));
    }


}
