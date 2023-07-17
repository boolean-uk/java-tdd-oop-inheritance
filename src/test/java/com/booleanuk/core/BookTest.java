package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {

    @Test
    public void getAuthorShouldReturnAuthor() {
        Author author = new Author("Jan", "email: jan_author@gmail.com", "jan.com");
        Book book = new Book("Witcher", author);

        Assertions.assertEquals(author.name(), book.getAuthor().name());
        Assertions.assertEquals(author.contactInformation(), book.getAuthor().contactInformation());
        Assertions.assertEquals(author.website(), book.getAuthor().website());
    }

}
