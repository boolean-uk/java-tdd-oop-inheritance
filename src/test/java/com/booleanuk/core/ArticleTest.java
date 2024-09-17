package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    Author bestAuthor = new Author(
            "Carmen Barcia",
            "none",
            "booleanFinalExercise.com"
    );
    @Test
    public void shouldCheckOutIfAvailable() {
        Article article = new Article(bestAuthor, "JUnit Rocks");
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article(bestAuthor, "JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Article article = new Article(bestAuthor, "JUnit Rocks");
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Article article = new Article(bestAuthor, "JUnit Rocks");

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void testAuthor() {
        Book book = new Book(bestAuthor,"JUnit Rocks");


        Author a = book.author();
        Assertions.assertEquals("Carmen Barcia", a.getName());
        Assertions.assertEquals("none", a.getContactInfo());
        Assertions.assertEquals("booleanFinalExercise.com", a.getWebsite());
    }
}
