package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {
    @Test
    public void shouldHaveName() {
        Newspaper newspaper = new Newspaper("The Daily Java");
        Assertions.assertEquals("The Daily Java", newspaper.title);
    }
}
