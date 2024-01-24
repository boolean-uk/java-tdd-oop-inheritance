package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void testAddToStock() {
        Library library = new Library();

        Stock article = new Article("Deep dive into Games of Throne");
        Stock book = new Book("The Maze Runner");
        Stock newspaper= new Newspaper("BBC Today's News");

        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        boolean articleIsAdded = library.stockItems.contains(article);
        boolean bookIsAdded = library.stockItems.contains(book);
        boolean newspaperIsAdded = library.stockItems.contains(newspaper);

        Assertions.assertTrue(articleIsAdded);
        Assertions.assertTrue(bookIsAdded);
        Assertions.assertTrue(newspaperIsAdded);
    }

    @Test
    void testCheckInStockIsOnLoan() {
        Library library = new Library();

        Stock article = new Article("Deep dive into Games of Thrones");
        Stock book = new Book("The Maze Runner");
        Stock newspaper= new Newspaper("BBC Today's News");
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        library.checkOutStock("Deep dive into Games of Thrones");
        library.checkOutStock("The Maze Runner");
        library.checkOutStock("BBC Today's News");

        String result1 = library.checkInStock("Deep dive into Games of Thrones");
        String result2 = library.checkInStock("The Maze Runner");
        String result3 = library.checkInStock("BBC Today's News");

        Assertions.assertEquals("item has been checked in", result1);
        Assertions.assertEquals("item has been checked in", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);

    }

    @Test
    void testCheckInStockNotOnLoan() {
        Library library = new Library();
        Stock article = new Article("Deep dive into Games of Throne");
        Stock book = new Book("The Maze Runner");
        Stock newspaper= new Newspaper("BBC Today's News");

        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        String result1 = library.checkInStock("Deep dive into Games of Throne");
        String result2 = library.checkInStock("The Maze Runner");
        String result3 = library.checkInStock("BBC Today's News");

        Assertions.assertEquals("item is not currently on loan", result1);
        Assertions.assertEquals("item is not currently on loan", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);
    }


    @Test
    void testCheckOutStockIfAvailable() {
        Library library = new Library();
        Stock article = new Article("Deep dive into Games of Throne");
        Stock book = new Book("The Maze Runner");
        Stock newspaper= new Newspaper("BBC Today's News");

        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        String result1 = library.checkOutStock("Deep dive into Games of Throne");
        String result2 = library.checkOutStock("The Maze Runner");
        String result3 = library.checkOutStock("BBC Today's News");

        Assertions.assertEquals("item has been checked out", result1);
        Assertions.assertEquals("item has been checked out", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);

    }

    @Test
    void testCheckOutStockIfNotAvailable() {
        Library library = new Library();
        Stock article = new Article("Deep dive into Games of Throne");
        Stock book = new Book("The Maze Runner");
        Stock newspaper= new Newspaper("BBC Today's News");

        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        library.checkOutStock("Deep dive into Games of Throne");
        library.checkOutStock("The Maze Runner");
        library.checkOutStock("BBC Today's News");

        String result1 = library.checkOutStock("Deep dive into Games of Throne");
        String result2 = library.checkOutStock("The Maze Runner");
        String result3 = library.checkOutStock("BBC Today's News");

        Assertions.assertEquals("item is currently on loan", result1);
        Assertions.assertEquals("item is currently on loan", result2);
        Assertions.assertEquals("newspapers are not available for loan", result3);

    }
}