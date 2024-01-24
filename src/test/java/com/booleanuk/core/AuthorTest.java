package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @Test
    public void shouldReturnAuthorsName() {
        Author Osamah = new Author("Osamah Al-maliki", "osamah.al-maliki@no.experis.com", "osamah.com");
        Article article = new Article("JUnit Rocks", Osamah);
        Assertions.assertEquals("The author is Osamah Al-maliki", article.getAuthorName());
    }

    @Test
    public void shouldDeclineIfNotAvailableToCheckout() {
        Article article = new Article("JUnit Rocks");

        Assertions.assertEquals("This reading material has no author", article.getAuthorName());
    }
}
