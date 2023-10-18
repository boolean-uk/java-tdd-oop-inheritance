package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @Test
    void AuthorNameShouldBeCorrect() {
        Author author = new Author("Emil", "emil@email.com", "www.emil.com");
        Assertions.assertEquals("Emil", author.name);
    }
    @Test
    void AuthorEmailShouldBeCorrect() {
        Author author = new Author("Emil", "emil@email.com", "www.emil.com");
        Assertions.assertEquals("emil@email.com", author.contactInfo);
    }
    @Test
    void AuthorWebsiteShouldBeCorrect() {
        Author author = new Author("Emil", "emil@email.com", "www.emil.com");
        Assertions.assertEquals("www.emil.com", author.websiteInfo);
    }
}
