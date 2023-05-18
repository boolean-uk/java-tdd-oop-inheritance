package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddArticle(){
        Library library = new Library();
        Article article = new Article(("JUnit Rocks"));
        library.addToStock(article);

        Assertions.assertTrue(library.items.contains(article));
    }

    @Test
    public void testAddBook(){
        Library library = new Library();
        Book book = new Book(("Java stories"));
        library.addToStock(book);

        Assertions.assertTrue(library.items.contains(book));
    }

    @Test
    public void testAddNewspaper(){
        Library library = new Library();
        Newspaper newspaper = new Newspaper(("Java Daily"));
        library.addToStock(newspaper);

        Assertions.assertTrue(library.items.contains(newspaper));
    }

    @Test
    public void testCheckInAndOutArticle(){
        Library library = new Library();
        Article article = new Article(("JUnit Rocks"));
        library.addToStock(article);
        library.checkOutItem(article.title);
        Assertions.assertTrue(article.isOnLoan());
        library.checkInItem(article.title);
        Assertions.assertFalse(article.isOnLoan());
    }

    @Test
    public void testCheckInAndOutBook(){
        Library library = new Library();
        Book book = new Book(("Java stories"));
        library.addToStock(book);

        library.checkOutItem(book.title);
        Assertions.assertTrue(book.isOnLoan());
        library.checkInItem(book.title);
        Assertions.assertFalse(book.isOnLoan());
    }

    @Test
    public void testCheckInAndOutNewspaper(){
        Library library = new Library();
        Newspaper newspaper = new Newspaper(("Java Daily"));
        library.addToStock(newspaper);

        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newspaper.title));
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newspaper.title));
    }


}
