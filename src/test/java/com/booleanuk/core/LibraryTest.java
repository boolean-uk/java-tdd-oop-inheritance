package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    static Library library;
    static Product book1;
    static Product book2;
    static Product article1;
    static Product newspaper1;

    @BeforeAll
    static void setup() {
        library = new Library();

        book1 = new Book("Book 1", new Author("J. K. Rowling", "122-222-333", "www.example.com"));
        book2 = new Book("Book 2", new Author("Andrzej Sapkowski", "Borsucza 89/45", "www.example.com"));
        article1 = new Article("Article 1", new Author("Author 1", "contact 1", "website1"));
        newspaper1 = new Newspaper("Newspaper 1");
    }

    @AfterEach
    void clear() {
        library.products.clear();
        book1.checkIn();
        article1.checkIn();
        newspaper1.checkIn();
    }


    @Test
    public void testAddToStock_ShouldAdd() {
        //When
        library.addToStock(book1);
        boolean result1 = library.products.contains(book1);
        library.addToStock(article1);
        boolean result2 = library.products.contains(article1);
        library.addToStock(newspaper1);
        boolean result3 = library.products.contains(newspaper1);

        //Then
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
    }

    @Test
    public void testCheckInProduct_WhenProductIsInLibrary_ShouldCheckIn() {
        //Given
        library.addToStock(book1);
        library.addToStock(article1);
        library.addToStock(newspaper1);

        //When
        String result1 = library.checkInProduct(book1.title);
        String result2 = library.checkInProduct(article1.title);
        String result3 = library.checkInProduct(newspaper1.title);

        //Then
        Assertions.assertEquals("item is not currently on loan", result1);
        Assertions.assertEquals("item is not currently on loan", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);
    }

    @Test
    public void testCheckOutProduct_WhenProductIsInLibrary_ShouldCheckOut() {
        //Given
        library.addToStock(book1);
        library.addToStock(article1);
        library.addToStock(newspaper1);

        //When
        String result1 = library.checkOutProduct(book1.title);
        String result2 = library.checkOutProduct(article1.title);
        String result3 = library.checkOutProduct(newspaper1.title);

        //Then
        Assertions.assertEquals("item has been checked out", result1);
        Assertions.assertEquals("item has been checked out", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);
    }

    @Test
    public void testCheckInProduct_WhenProductIsInNotLibrary_ShouldNotCheckIn() {
        //Given

        //When
        String result1 = library.checkInProduct(book1.title);
        String result2 = library.checkInProduct(article1.title);
        String result3 = library.checkInProduct(newspaper1.title);

        //Then
        Assertions.assertEquals("item is not part of the library's collection", result1);
        Assertions.assertEquals("item is not part of the library's collection", result2);
        Assertions.assertEquals("item is not part of the library's collection", result3);
    }

    @Test
    public void testCheckOutProduct_WhenProductIsInLibraryButItIsLoaned_ShouldNotCheckOut() {
        //Given
        library.addToStock(book1);
        library.addToStock(article1);
        library.addToStock(newspaper1);

        //When
        library.checkOutProduct(book1.title);
        library.checkOutProduct(article1.title);
        library.checkOutProduct(newspaper1.title);
        String result1 = library.checkOutProduct(book1.title);
        String result2 = library.checkOutProduct(article1.title);
        String result3 = library.checkOutProduct(newspaper1.title);

        //Then
        Assertions.assertEquals("item is currently on loan", result1);
        Assertions.assertEquals("item is currently on loan", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);
    }

    @Test
    public void testCheckInProduct_WhenProductIsInLibraryButItIsLoaned_ShouldNotCheckIn() {
        //Given
        library.addToStock(book1);
        library.addToStock(article1);
        library.addToStock(newspaper1);

        //When
        library.checkOutProduct(book1.title);
        library.checkOutProduct(article1.title);
        library.checkOutProduct(newspaper1.title);
        String result1 = library.checkInProduct(book1.title);
        String result2 = library.checkInProduct(article1.title);
        String result3 = library.checkInProduct(newspaper1.title);

        //Then
        Assertions.assertEquals("item has been checked in", result1);
        Assertions.assertEquals("item has been checked in", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);
    }
}
