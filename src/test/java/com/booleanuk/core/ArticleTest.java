package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author a1 = new Author("Hugh Mann");
        Article article = new Article("JUnit Rocks",a1);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author a1 = new Author("Hugh Mann");

        Article article = new Article("JUnit Rocks",a1);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author a1 = new Author("Hugh Mann");

        Article article = new Article("JUnit Rocks",a1);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author a1 = new Author("Hugh Mann");

        Article article = new Article("JUnit Rocks",a1);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }
}
