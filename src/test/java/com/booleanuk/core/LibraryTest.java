package com.booleanuk.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTest {

    private static Library LIBRARY;
    private static LibraryItem ARTICLE;
    private static LibraryItem BOOK;

    @BeforeAll
    public static void initializeLibrary() {
        LIBRARY = new Library();
        ARTICLE = new Article("JUnit Rocks");
    }

    @BeforeEach
    public void initializeBook() {
        BOOK = new Book("Amazing Title");
    }

    @AfterEach
    public void clear() {
        LIBRARY.clearLibrary();
    }

    @Test
    public void addToStockLibraryItemTest() {
        assertEquals(0, LIBRARY.getLibraryItems().size());

        LIBRARY.addToStock(ARTICLE);

        assertEquals(1, LIBRARY.getLibraryItems().size());
        assertEquals(
                "JUnit Rocks",
                LIBRARY.getLibraryItems().get(0).getTitle()
        );
    }

    @Test
    public void checkInLibraryItemInTheStockCheckedInTest() {
        LIBRARY.addToStock(BOOK);

        assertEquals(
                "item is not currently on loan",
                LIBRARY.checkInLibraryItem("Amazing Title")
        );
    }

    @Test
    public void checkInLibraryItemInTheStockCheckedOutTest() {
        LIBRARY.addToStock(BOOK);
        BOOK.checkOut();

        assertEquals(
                "item has been checked in",
                LIBRARY.checkInLibraryItem("Amazing Title")
        );
    }

    @Test
    public void checkInLibraryItemIsNotInTheStockTest() {
        assertEquals(
                "item is not part of the library's collection",
                LIBRARY.checkInLibraryItem("Amazing Title")
        );
    }

    @Test
    public void checkOutLibraryItemInTheStockCheckedInTest() {
        LIBRARY.addToStock(BOOK);

        assertEquals(
                "item has been checked out",
                LIBRARY.checkOutLibraryItem("Amazing Title")
        );
    }

    @Test
    public void checkOutLibraryItemInTheStockCheckedOutTest() {
        LIBRARY.addToStock(BOOK);
        BOOK.checkOut();

        assertEquals(
                "item is currently on loan",
                LIBRARY.checkOutLibraryItem("Amazing Title")
        );
    }

    @Test
    public void checkOutLibraryItemIsNotInTheStockTest() {
        assertEquals(
                "item is not part of the library's collection",
                LIBRARY.checkOutLibraryItem("Amazing Title")
        );
    }
}
