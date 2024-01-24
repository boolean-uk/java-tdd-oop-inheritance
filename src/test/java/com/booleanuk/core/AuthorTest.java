package com.booleanuk.core;

import com.booleanuk.core.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AuthorTest {

    @Test
    public void shouldGetAuthorInformation() {
        Author author = new Author("Petros Mylonas", "Petros.mylonas@email.com", "www.petrosmylonas.com");
        Assertions.assertEquals("Petros Mylonas", author.getName());
        Assertions.assertEquals("Petros.mylonas@email.com", author.getContactInformation());
        Assertions.assertEquals("www.petrosmylonas.com", author.getWebsite());
    }
}
