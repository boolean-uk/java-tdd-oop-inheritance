package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {

    Author author = new Author("Bob", "bob@gmail.com", "911", "www.bob.com");
    Article article = new Article("JUnit Rocks", author);

    @Test
    public void shouldCheckOutIfAvailable() {
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldReturnAuthorInfo() {
        String expected = "This item is written by " + author.getName() + " (e-mail: " + author.getEmail() + ", phone number: "
                + author.getPhoneNumber() +", website: " + author.getWebsite() + ")";
        Assertions.assertEquals(expected, article.getAuthor());
    }
}
