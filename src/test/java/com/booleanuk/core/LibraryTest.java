package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void checkOutRentableReadingMaterialTest(){
        Library library = new Library();
        RentableReadingMaterial book = new Book("My Java life");
        library.addToStock(book);

        String result = library.checkOutRentableReadingMaterial("My Java life");
        Assertions.assertEquals("Item has been checked out.", result);

        result = library.checkOutRentableReadingMaterial("My Java life");
        Assertions.assertEquals("Item is currently on loan.", result);

        result = library.checkOutRentableReadingMaterial("The secret life of cats");
        Assertions.assertEquals("Item is not part of the library's collection.", result);
    }

    @Test void checkInRentableReadingMaterialTest(){
        Library library = new Library();
        RentableReadingMaterial book = new Book("My Java life");
        library.addToStock(book);

        library.checkOutRentableReadingMaterial("My Java life");
        String result = library.checkInRentableReadingMaterial("My Java life");
        Assertions.assertEquals("Item has been checked in.", result);

        result = library.checkInRentableReadingMaterial("My Java life");
        Assertions.assertEquals("Item is not currently on loan.", result);

        result = library.checkInRentableReadingMaterial("The life of a cat");
        Assertions.assertEquals("Item is not part of the library's collection.", result);

    }


}
