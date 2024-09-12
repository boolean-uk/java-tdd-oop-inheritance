package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class LibraryTest {
    @Test
    public void testAddBookToList(){
        Author author = new Author("JRR","JRR@email.no","Tolkien.com");
        ReadMaterials book = new Book("Lotr",author);
        Library library = new Library();
        library.addToStock(book);
        Assertions.assertEquals(book, library.readMaterials.get(0));
    }

    @Test
    public void testCheckOutItem(){
        Author author = new Author("JRR","JRR@email.no","Tolkien.com");
        ReadMaterials book = new Book("Lotr",author);
        Library library = new Library();
        library.addToStock(book);

        library.checkOutItem("Lotr");
        Assertions.assertTrue(book.onLoan);
    }
    @Test
    public void testCheckInItem(){
        Author author = new Author("JRR","JRR@email.no","Tolkien.com");
        ReadMaterials book = new Book("Lotr",author);
        Library library = new Library();
        library.addToStock(book);

        library.checkOutItem("Lotr");
        library.checkInItem("Lotr");
        Assertions.assertFalse(book.onLoan);
    }
}
