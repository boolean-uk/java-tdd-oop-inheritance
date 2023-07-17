package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ArticleTest {

    @Test
    public void getAuthorShouldReturnAuthor() {
        Author author = new Author("Jan", "email: jan_author@gmail.com", "jan.com");
        Article article = new Article("Article", author);

        Assertions.assertEquals(author.name(), article.getAuthor().name());
        Assertions.assertEquals(author.contactInformation(), article.getAuthor().contactInformation());
        Assertions.assertEquals(author.website(), article.getAuthor().website());


    }

}
