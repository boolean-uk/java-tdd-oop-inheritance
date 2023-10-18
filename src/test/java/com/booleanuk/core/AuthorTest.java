package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    @Test
    public void gettersTest() {
        Author author = new Author("John", "john@gmail.com", "john.com");
        Assertions.assertEquals("John", author.getName());
        Assertions.assertNotEquals("Bob", author.getName());
        Assertions.assertEquals("john@gmail.com", author.getEmail());
        Assertions.assertNotEquals("bob@gmail.com", author.getEmail());
        Assertions.assertEquals("john.com", author.getWebsite());
        Assertions.assertNotEquals("bob.com", author.getWebsite());
    }
}
