package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
    @Test
    public void testCheckInItem() {
        Library library = new Library();
        Item item = new Book("Book");
        library.addToStock(item);

        String result = library.checkInItem("Book");

        Assertions.assertEquals("item is not currently on loan", result);
    }
    @Test
    public void testCheckOutItem(){
        Library library = new Library();
        Item item = new Book("Book");
        library.addToStock(item);
        String result = library.checkOutItem("Book");

        Assertions.assertEquals("item has been checked out", result);
    }

    @Test
    public void testCheckOutAndCheckInItem(){
        Library library = new Library();
        Item item = new Article("Article");
        library.addToStock(item);

        String result = library.checkOutItem("Article");
        Assertions.assertEquals("item has been checked out", result);

        String result2 = library.checkInItem("Article");
        Assertions.assertEquals("item has been checked in", result2);
    }

    @Test
    public void testCheckInItemNotInStock() {
        Library library = new Library();

        String result = library.checkInItem("Nonexistent Book");

        Assertions.assertEquals("item is not part of the library's collection", result);
    }

    @Test
    public void testCheckOutNewspaper() {
        Library library = new Library();
        Item newspaper = new Newspaper("Newspaper");
        library.addToStock(newspaper);

        String expected = "newspapers are not available for loan";

        Assertions.assertEquals(expected, library.checkOutItem("Newspaper"));
    }

    @Test
    public void testCheckOutItemNotInStock() {
        Library library = new Library();

        String result = library.checkOutItem("Nonexistent Magazine");

        Assertions.assertEquals("item is not part of the library's collection", result);
    }

    /*Exercise 2 Tests*/

    @Test
    public void testGettingAuthorNameFromABook(){
        Library library = new Library();
        Author author = new Author("John Doe", "http://www.johndoe.com", "contact@johndoe.com");
        library.addToStock(new Book("Book", author));
        String expected = "Author: " + "John Doe" +
                "\nContact Information: " + "contact@johndoe.com" +
                "\nWebsite: " + "http://www.johndoe.com";

        Assertions.assertEquals(expected, library.getItemFromName("Book").getAuthorInformation());
    }
    @Test
    public void testGettingAuthorInformationFromArticle(){
        Library library = new Library();
        Author author = new Author("John Doe", "http://www.johndoe.com", "contact@johndoe.com");
        library.addToStock(new Article("Article", author));
        String expected = "Author: " + "John Doe" +
                "\nContact Information: " + "contact@johndoe.com" +
                "\nWebsite: " + "http://www.johndoe.com";

        Assertions.assertEquals(expected, library.getItemFromName("Article").getAuthorInformation());
    }
    @Test
    public void testGettingAuthorInformationFromNewspaper(){
        Library library = new Library();
        library.addToStock(new Newspaper("Newspaper"));
        String expected = "Can't provide author on a newspaper";
        Assertions.assertEquals(expected, library.getItemFromName("Newspaper").getAuthorInformation());
    }

    @Test
    public void testGettingItemNotInLibrary(){
        Library library = new Library();
        Assertions.assertNull(library.getItemFromName("Null"));
    }

}

