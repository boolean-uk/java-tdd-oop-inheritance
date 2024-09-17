package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testAddArticle(){
        Library library = new Library();
        Author author = new Author("A. Author", "author@author.com", "www.author.com");
        Article article = new Article("JUnit Rocks", author);
        library.addToStock(article);

        Assertions.assertTrue(library.items.contains(article));
    }

    @Test
    public void testAddBook(){
        Library library = new Library();
        Author author = new Author("A. Author", "author@author.com", "www.author.com");
        Book book = new Book(("Java stories"), author);
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
        Author author = new Author("A. Author", "author@author.com", "www.author.com");
        Article article = new Article("JUnit Rocks", author);
        library.addToStock(article);
        library.checkOutItem(article.getTitle());
        Assertions.assertTrue(article.isOnLoan());
        library.checkInItem(article.getTitle());
        Assertions.assertFalse(article.isOnLoan());
    }

    @Test
    public void testCheckInAndOutBook(){
        Library library = new Library();
        Author author = new Author("A. Author", "author@author.com", "www.author.com");
        Book book = new Book(("Java stories"), author);
        library.addToStock(book);

        library.checkOutItem(book.getTitle());
        Assertions.assertTrue(book.isOnLoan());
        library.checkInItem(book.getTitle());
        Assertions.assertFalse(book.isOnLoan());
    }

    @Test
    public void testCheckInAndOutNewspaper(){
        Library library = new Library();
        Newspaper newspaper = new Newspaper(("Java Daily"));
        library.addToStock(newspaper);

        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newspaper.getTitle()));
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(newspaper.getTitle()));
    }


}
