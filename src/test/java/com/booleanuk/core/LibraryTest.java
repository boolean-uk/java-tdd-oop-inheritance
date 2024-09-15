package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryTest {
    Library library;
    Book book;

    @BeforeEach
    public void setUp() {
        library = new Library();
        book = new Book("Java is great",  new Author("Dave Ames", "dave@boolean.uk.com", "boolean.uk.com"));
        library.addToStock(new Article("JUnit Rocks",  new Author("Dave Ames", "dave@boolean.uk.com", "boolean.uk.com")));
        library.addToStock(book);
        library.addToStock(new Newspaper("C# is not great"));
        library.addToStock(new Item("Marlena"));
    }

//    public String checkOut() {
//        if (this.isOnLoan()) {
//            return "item is currently on loan";
//        }
//
//        this.onLoan = true;
//
//        return "item has been checked out";
//    }

    @Test
    public void checkInItemTestShouldReturnItemNotInStock() {
        Assertions.assertEquals(library.checkInItem("Adilet"), "item is not part of the library's collection");
    }

    @Test
    public void checkInItemTestShouldReturnItemInStock() {
        book.onLoan = true;
        Assertions.assertEquals(library.checkInItem("Java is great"), "item has been checked in");
    }

    @Test
    public void checkOutItemTestShouldReturnItemOnLoan() {
        book.onLoan = true;
        Assertions.assertEquals(library.checkOutItem("Java is great"), "item is currently on loan");
    }
}
