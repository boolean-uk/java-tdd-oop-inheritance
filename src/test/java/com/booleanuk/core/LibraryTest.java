package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    static Author AUTHOR;
    static Library LIBRARY;

    @BeforeAll
    static void authorSetup() {
        AUTHOR = new Author("John", "123456789", "https://site.com");
    }

    @BeforeEach
    void librarySetup() {
        LIBRARY = new Library();
    }

    @Test
    public void addToStockAddsArticleToList(){
        LibraryItem article = new Article("article", AUTHOR);
        LIBRARY.addToStock(article);
        Assertions.assertTrue(LIBRARY.getLibraryItems().contains(article));
    }

    @Test
    public void addToStockAddsBookToList(){
        LibraryItem book = new Book("article", AUTHOR);
        LIBRARY.addToStock(book);
        Assertions.assertTrue(LIBRARY.getLibraryItems().contains(book));
    }

    @Test
    public void addToStockAddsNewspaperToList(){
        Newspaper newspaper = new Newspaper("article");
        LIBRARY.addToStock(newspaper);
        Assertions.assertTrue(LIBRARY.getLibraryItems().contains(newspaper));
    }

    @Test
    public void checkInBook(){
        LibraryItem book = new Book("book", AUTHOR);
        LibraryItem article = new Article("article", AUTHOR);
        LibraryItem newspaper = new Newspaper("newspaper", AUTHOR);
        LIBRARY.addToStock(book);
        LIBRARY.addToStock(article);
        LIBRARY.addToStock(newspaper);
        Assertions.assertEquals("item is not part of the library's collection"
        , LIBRARY.checkInBook("magazine"));
        Assertions.assertEquals(book.checkIn()
                , LIBRARY.checkInBook("book"));
        Assertions.assertEquals(article.checkIn()
                , LIBRARY.checkInBook("article"));
        Assertions.assertEquals(newspaper.checkIn()
                , LIBRARY.checkInBook("newspaper"));
    }

    @Test
    public void checkOutBook(){
        LibraryItem book = new Book("book", AUTHOR);
        LibraryItem article = new Article("article", AUTHOR);
        LibraryItem newspaper = new Newspaper("newspaper", AUTHOR);
        LIBRARY.addToStock(book);
        LIBRARY.addToStock(article);
        LIBRARY.addToStock(newspaper);
        Assertions.assertEquals("item is not part of the library's collection"
                , LIBRARY.checkOutBook("magazine"));
        book.checkOut();
        Assertions.assertEquals(book.checkOut()
                , LIBRARY.checkOutBook("book"));
        article.checkOut();
        Assertions.assertEquals(article.checkOut()
                , LIBRARY.checkOutBook("article"));
        Assertions.assertEquals(newspaper.checkOut()
                , LIBRARY.checkOutBook("newspaper"));
    }
}
