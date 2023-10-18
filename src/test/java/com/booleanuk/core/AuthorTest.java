package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorTest {
    private Author author;
    private final String name = "J.R.R. Tolkien";
    private final String email = "tolkien@gmail.com";
    private final String phoneNumber = "555-555-5555";
    private final String website = "tolkien.com";

    @BeforeEach
    public void setup() {
        author = new Author("J.R.R. Tolkien", "tolkien@gmail.com",
                "555-555-5555", "tolkien.com");
    }

    @Test
    public void testNameGetter() {
        Assertions.assertEquals(name, author.getName(), "Author name should match the constructor argument");
    }

    @Test
    public void testEmailGetter() {
        Assertions.assertEquals(email, author.getEmail(), "Author email should match the constructor argument");
    }

    @Test
    public void testPhoneNumberGetter() {
        Assertions.assertEquals(phoneNumber, author.getPhoneNumber(), "Author phone number should match the constructor argument");
    }

    @Test
    public void testWebsiteGetter() {
        Assertions.assertEquals(website, author.getWebsite(), "Author website should match the constructor argument");
    }

}
