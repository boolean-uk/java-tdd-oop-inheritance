package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {
    @Test
    public void shouldCheckOutIfAvailable() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);
        Assertions.assertEquals("item has been checked out", article.checkOut());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("item is currently on loan", article.checkOut());
    }

    @Test
    public void shouldCheckInIfOnLoan() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);
        article.checkOut();

        Assertions.assertEquals("item has been checked in", article.checkIn());
    }

    @Test
    public void shouldDeclineCheckInIfNotOnLoan() {
        Author author = new Author("Bob Bagel","+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("item is not currently on loan", article.checkIn());
    }

    @Test
    public void shouldSayBobBagel()
    {
        Author author = new Author("Bob Bagel", "+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("Bob Bagel", article.getAuthor());
    }

    @Test
    public void shouldSayContactInfo()
    {
        Author author = new Author("Bob Bagel", "+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("+001938563924874570", article.getContactInfo());
    }

    @Test
    public void shouldSayWebsite()
    {
        Author author = new Author("Bob Bagel", "+001938563924874570", "https://www.bobbagel.eu");
        Article article = new Article("JUnit Rocks", author);

        Assertions.assertEquals("https://www.bobbagel.eu", article.getWebsite());
    }
}
