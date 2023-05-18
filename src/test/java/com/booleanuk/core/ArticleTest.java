package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
    @Test
    public void testAuthor(){
        Article article = new Article("The industrial revolution and it's consequences",new Author("Dennis Voutos"));
        Assertions.assertEquals("Dennis Voutos",article.author.fullName);
        Assertions.assertEquals("N/A",article.author.contactInformation);
        Assertions.assertEquals(0,article.author.age);
        Book book = new Book("The industrial revolution and it's consequences",new Author("Dennis Voutos","fakemail@gmail.com","Dennisvoutos.gr",25));
        Assertions.assertEquals("Dennis Voutos",book.author.fullName);
        Assertions.assertEquals("fakemail@gmail.com",book.author.contactInformation);
        Assertions.assertEquals(25,book.author.age);
    }
}
