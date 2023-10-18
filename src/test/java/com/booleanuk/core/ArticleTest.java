package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Document article = new Article("JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Document article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Document article = new Article("JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Document article = new Article("JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldPrintAuthor(){
        Article article = new Article("JUnit Rocks",
                new Author("Dave Ames",
                        "https:boolean.uk.com", "697745934", "daveamos@boolean.com"));
        String expectedPhone = "697745934";
        Assertions.assertEquals(expectedPhone, article.author.contactInfo.phoneNumber);

        System.out.println(article.author);

    }
}
