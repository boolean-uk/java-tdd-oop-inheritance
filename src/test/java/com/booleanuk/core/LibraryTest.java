package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {


    @Test
    void testAddToStockArticle() {
        Library library = new Library();
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Article article = new Article("Article title",author);

        Assertions.assertEquals(0,library.getItems().size());
        library.addToStock(article);
        Assertions.assertTrue(library.getItems().contains(article));
        Assertions.assertEquals(1,library.getItems().size());


    }

    @Test
    void testAddToStockBook() {
        Library library = new Library();
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Book book = new Book("Book title",author);

        Assertions.assertEquals(0,library.getItems().size());
        library.addToStock(book);
        Assertions.assertTrue(library.getItems().contains(book));
        Assertions.assertEquals(1,library.getItems().size());
    }

    @Test
    void testAddToStockNewspaper() {

        Library library = new Library();
        Newspaper newspaper = new Newspaper("Newspaper title");

        Assertions.assertEquals(0,library.getItems().size());
        library.addToStock(newspaper);
        Assertions.assertTrue(library.getItems().contains(newspaper));
        Assertions.assertEquals(1,library.getItems().size());
    }

    @Test
    void testCheckInArticle() {
        Library library = new Library();
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");

        Article article = new Article("Article title",author);

        library.addToStock(article);
        Assertions.assertEquals("item is not currently on loan",library.checkInItem( "Article title"));

        Assertions.assertEquals("item is not part of the library's collection",library.checkInItem("Wrong article title"));

    }
    @Test
    public void testCheckOutArticle() {
        Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
        Article article = new Article("Introduction to Machine Learning",author);
        Library library = new Library();
        library.addToStock(article);

        String result = library.checkOutItem("Introduction to Machine Learning");

        Assertions.assertEquals("item has been checked out", result);
        Assertions.assertTrue(article.isOnLoan());
    }

    @Test
    public void testCheckInBook() {
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
        Book book = new Book("Java Programming", author);
        Library library = new Library();
        library.addToStock(book);

        String result = library.checkInItem("Java Programming");

        Assertions.assertEquals("item is not currently on loan", result);
        Assertions.assertFalse(book.isOnLoan());
    }


    @Test
    void testCheckOutBook() {
        Author author = new Author("Jane Smith", "jane.smith@example.com", "www.janesmith.com");
        Book book = new Book("Introduction to Machine Learning",author);
        Library library = new Library();
        library.addToStock(book);

        String result = library.checkOutItem("Introduction to Machine Learning");

        Assertions.assertEquals("item has been checked out", result);
        Assertions.assertTrue(book.isOnLoan());
    }

    @Test
    void testCheckInNewspaper() {

        Newspaper newspaper = new Newspaper("Newspaper Programming");
        Library library = new Library();
        library.addToStock(newspaper);

        String result = library.checkInItem("Newspaper Programming");

        Assertions.assertEquals("newspapers are not available for loan", result);
        Assertions.assertFalse(newspaper.isOnLoan());
    }

    @Test
    void testCheckOutNewspaper() {
        Newspaper newspaper = new Newspaper("Newspaper Programming");
        Library library = new Library();
        library.addToStock(newspaper);

        String result = library.checkOutItem("Newspaper Programming");

        Assertions.assertEquals("newspapers are not available for loan", result);
        Assertions.assertFalse(newspaper.isOnLoan());

    }
    @Test
    public void testGetAuthor() {
        Author author = new Author("John Doe", "john.doe@example.com", "www.johndoe.com");
        Book book = new Book("Java Programming", author);

        Author retrievedAuthor = book.getAuthor();

        Assertions.assertEquals("John Doe", retrievedAuthor.getName());
        Assertions.assertEquals("john.doe@example.com", retrievedAuthor.getContactInformation());
        Assertions.assertEquals("www.johndoe.com", retrievedAuthor.getWebsite());
    }


}
