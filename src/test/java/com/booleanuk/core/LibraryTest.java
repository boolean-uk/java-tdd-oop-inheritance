package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testAddingCheckInCheckOut(){
        Library library = new Library();
        Author williamGolding = new Author("William Golding", "williegolding@gmail.com", "www.williegold.com");
        Book book = new Book("Lord of the flies", williamGolding);

        //Check in item not in collection
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Lord of the flies"));

        //Check out item not in collection
        Assertions.assertEquals("item is not part of the library's collection", library.checkInItem("Lord of the flies"));

        library.addToStock(book);
        //Check out item in collection

        Assertions.assertEquals("item has been checked out", library.checkOutItem("Lord of the flies"));

        //Check in item in collection

        Assertions.assertEquals("item has been checked in", library.checkInItem("Lord of the flies"));
    }

    @Test
    public void testGetAuthorInfo(){
        Library library = new Library();
        Author williamGolding = new Author("William Golding", "williegolding@gmail.com", "www.williamexample.com");
        Book book = new Book("Lord of the flies", williamGolding);

        Author JUnitauthor = new Author("Lars Hammar", "larshammar@example.com", "www.larshammarexample.com");
        Article article = new Article("JUnit Rocks", JUnitauthor);

        Newspaper newspaper = new Newspaper("The Daily Java");

        library.addToStock(book);
        library.addToStock(article);
        library.addToStock(newspaper);

        Assertions.assertEquals(
                "Author: William Golding, eMail: williegolding@gmail.com and website: www.williamexample.com",
                library.getInfoAboutAuthor("Lord of the flies"));

        Assertions.assertEquals(
                "Author: Lars Hammar, eMail: larshammar@example.com and website: www.larshammarexample.com",
                library.getInfoAboutAuthor("JUnit Rocks"));

        Assertions.assertEquals("The newspaper has multiple authors", newspaper.getAuthorInfo());
    }


}