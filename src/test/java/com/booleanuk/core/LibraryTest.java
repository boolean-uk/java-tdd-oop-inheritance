package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void checkOutRentableReadingMaterialTest(){
        Library library = new Library();
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        RentableReadingMaterial book = new Book("Teaching cats Java for dummies", author);
        library.addToStock(book);

        String result = library.checkOutRentableReadingMaterial("Teaching cats Java for dummies");
        Assertions.assertEquals("Item has been checked out.", result);

        result = library.checkOutRentableReadingMaterial("Teaching cats Java for dummies");
        Assertions.assertEquals("Item is currently on loan.", result);

        result = library.checkOutRentableReadingMaterial("The secret life of cats");
        Assertions.assertEquals("Item is not part of the library's collection.", result);
    }

    @Test void checkInRentableReadingMaterialTest(){
        Library library = new Library();
        Author author = new Author("Dave", "12345678", "Dave@Java.com");
        RentableReadingMaterial book = new Book("Teaching cats Java for dummies", author);
        library.addToStock(book);

        library.checkOutRentableReadingMaterial("Teaching cats Java for dummies");
        String result = library.checkInRentableReadingMaterial("Teaching cats Java for dummies");
        Assertions.assertEquals("Item has been checked in.", result);

        result = library.checkInRentableReadingMaterial("Teaching cats Java for dummies");
        Assertions.assertEquals("Item is not currently on loan.", result);

        result = library.checkInRentableReadingMaterial("The life of a cat");
        Assertions.assertEquals("Item is not part of the library's collection.", result);

    }


}
