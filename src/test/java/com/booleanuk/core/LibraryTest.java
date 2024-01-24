package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void addToStock(){
        Library library = new Library();
        Author author1 = new Author("name", "email@gamil.com", "website.com");
        Author author2 = new Author("name", "email@gamil.com", "website.com");

        Item item1 = new Book("book title", author1);
        Item item2 = new Article("article title", author2);
        Item item3 = new Newspaper("newspaper title");
        library.addToStock(item1);
        library.addToStock(item2);
        library.addToStock(item3);

        Assertions.assertTrue(library.itemList.contains(item1));
        Assertions.assertTrue(library.itemList.contains(item2));
        Assertions.assertTrue(library.itemList.contains(item3));
    }

    @Test
    public void checkInItem(){
        Library library = new Library();
        Author author1 = new Author("name", "email@gamil.com", "website.com");
        Author author2 = new Author("name", "email@gamil.com", "website.com");

        Item item1 = new Book("book title", author1);
        Item item2 = new Article("article title", author2);
        Item item3 = new Newspaper("newspaper title");
        library.addToStock(item1);
        library.addToStock(item2);
        library.addToStock(item3);
        Assertions.assertEquals("item is not currently on loan", library.checkInItem(item1.title));
        Assertions.assertEquals("item is not currently on loan", library.checkInItem(item2.title));
        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem(item3.title));

    }
    @Test
    public void checkInNonExitingItem(){
        Library library = new Library();
        Author author1 = new Author("name", "email@gamil.com", "website.com");
        Author author2 = new Author("name", "email@gamil.com", "website.com");

        Item item1 = new Book("book title", author1);
        Item item2 = new Article("article title", author2);

        library.addToStock(item2);
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem(item1.title));

    }
    @Test
    public void checkOutItem(){
        Library library = new Library();
        Author author1 = new Author("name", "email@gamil.com", "website.com");
        Author author2 = new Author("name", "email@gamil.com", "website.com");

        Item item1 = new Book("book title", author1);
        Item item2 = new Article("article title", author2);
        Item item3 = new Newspaper("newspaper title");
        library.addToStock(item1);
        library.addToStock(item2);
        library.addToStock(item3);
        Assertions.assertEquals("item has been checked out", library.checkOutItem(item1.title));
        Assertions.assertEquals("item has been checked out", library.checkOutItem(item2.title));
        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem(item3.title));

    }
    @Test
    public void checkOutNonExitingItem(){
        Library library = new Library();
        Author author1 = new Author("name", "email@gamil.com", "website.com");
        Author author2 = new Author("name", "email@gamil.com", "website.com");

        Item item1 = new Book("book title", author1);
        Item item2 = new Article("article title", author2);

        library.addToStock(item2);
        Assertions.assertEquals("item is not part of the library's collection", library.checkOutItem(item1.title));

    }
}
