package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");

        Book book = new Book("JUnit Rocks",author1);
        Assertions.assertEquals("item has been checked out", book.checkOut());
    }


    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");

        Book book = new Book("JUnit Rocks",author1);
        book.checkOut();

        Assertions.assertEquals("item is currently on loan", book.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");

        Book book = new Book("JUnit Rocks",author1);
        book.checkOut();

        Assertions.assertEquals("item has been checked in", book.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");

        Book book = new Book("JUnit Rocks",author1);

        Assertions.assertEquals("item is not currently on loan", book.checkIn());
    }
    @Test
    public void shouldGetAuthorInformation(){
        Author author1 =  new Author("Author 1", "author1@mail.com","www.author1.com");
        Article article = new Article("JUnit Rocks", author1);

        Assertions.assertEquals(author1, article.getAuthor());

    }
}
