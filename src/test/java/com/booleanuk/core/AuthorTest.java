package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class AuthorTest {

    @Test
    public void testGetters() {
        Author author = new Author("John Doe", "http://www.johndoe.com", "contact@johndoe.com");

        Assertions.assertEquals("John Doe", author.getName());
        Assertions.assertEquals("http://www.johndoe.com", author.getWebsite());
        Assertions.assertEquals("contact@johndoe.com", author.getContactInformation());
    }

}
