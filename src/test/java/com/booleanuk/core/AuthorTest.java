package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    Author author;

    @BeforeEach
    void setUp() {
        author = new Author("Bob", "12345678", "bobsbagels.com");
    }

    @Test
    public void shouldReturnAuthorsName() {
        Assertions.assertEquals("Bob", author.getName());
    }

    @Test
    public void shouldReturnAuthorsContactInformation() {
        Assertions.assertEquals("12345678", author.getContactInformation());
    }

    @Test
    public void shouldReturnAuthorsWebsite() {
        Assertions.assertEquals("bobsbagels.com", author.getWebsite());
    }
}

