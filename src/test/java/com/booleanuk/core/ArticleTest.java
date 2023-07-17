package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article("JUnit Rocks");
        assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks");
        article.checkOut();

        assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article("JUnit Rocks");
        article.checkOut();

        assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article("JUnit Rocks");

        assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void testArticleIsInstanceOfItem() {
        Article article = new Article("JUnit Rocks");

        Assertions.assertTrue(article instanceof Item);
    }
}
