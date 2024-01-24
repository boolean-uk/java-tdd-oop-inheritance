package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    Author author = new Author("Marit", "marit@someEmail.com", "marit.someWebsite.com");

    @Test
    public void shouldAddToStock() {
        Library library = new Library();
        Item item = new Item("JUnit Rocks");
        library.addToStock(item);

        Assertions.assertTrue(library.items.contains(item));
        Assertions.assertEquals(1, library.items.size());
    }

    @Test
    public void multipleItemsShouldAddToStock() {
        Library library = new Library();
        Item item = new Item("JUnit Rocks");
        Item article = new Article("Java Rocks", author);
        Item book = new Book("Java for Beginners", author);
        Item newspaper = new Newspaper("Java Newspaper");
        library.addToStock(item);
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        Assertions.assertEquals(4, library.items.size());
    }

    @Test
    public void shouldCheckOutIfAvailable() {
        Library library = new Library();
        Item article = new Article("Java Rocks", author);
        Item book = new Book("Java for Beginners", author);
        Item newspaper = new Newspaper("Java Newspaper");
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);

        Assertions.assertEquals("item has been checked out", library.checkOutItem("Java Rocks"));
        Assertions.assertEquals("item has been checked out", library.checkOutItem("Java for Beginners"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem("Java Newspaper"));
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Library library = new Library();
        Item article = new Article("Java Rocks", author);
        Item book = new Book("Java for Beginners", author);
        library.addToStock(article);
        library.addToStock(book);
        article.checkOut();
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", library.checkOutItem("Java Rocks"));
        Assertions.assertEquals("item is currently on loan", library.checkOutItem("Java for Beginners"));
    }

    @Test
    public void shouldDeclineCheckoutIfNotPartOfLibraryCollection() {
        Library library = new Library();

        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Java Rocks"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Java for Beginners"));
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem("Java Newspaper"));
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Library library = new Library();
        Item article = new Article("Java Rocks", author);
        Item book = new Book("Java for Beginners", author);
        Item newspaper = new Newspaper("Java Newspaper");
        library.addToStock(article);
        library.addToStock(book);
        library.addToStock(newspaper);
        article.checkOut();
        book.checkOut();

        Assertions.assertEquals("item has been checked in", library.checkInItem("Java Rocks"));
        Assertions.assertEquals("item has been checked in", library.checkInItem("Java for Beginners"));
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem("Java Newspaper"));
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Library library = new Library();
        Item article = new Article("Java Rocks", author);
        Item book = new Book("Java for Beginners", author);
        library.addToStock(article);
        library.addToStock(book);

        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Java Rocks"));
        Assertions.assertEquals("item is not currently on loan", library.checkInItem("Java for Beginners"));
    }

    @Test
    public void shouldDeclineCheckInIfNotPartOfLibraryCollection() {
        Library library = new Library();
        Item article = new Article("Java Rocks", author);
        Item book = new Book("Java for Beginners", author);
        Item newspaper = new Newspaper("Java Newspaper");

        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem(article.title));
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem(book.title));
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem(newspaper.title));
    }
}
