package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ItemTest {
    @Test
    public void testItemSubclassesList() {
        List<Item> itemList = new ArrayList<>();
        itemList.add(new Article("Article"));
        itemList.add(new Book("Book"));
        itemList.add(new Newspaper("Newspaper"));

        Assertions.assertEquals(3, itemList.size());
    }

    @Test
    public void testGettingItemAuthor() {
        Item item = new Article("Article", new Author("Name", "Contact", "Website"));
        Assertions.assertEquals("Name, Contact, Website", item.getAuthor());

        item = new Newspaper("Newspaper");
        Assertions.assertEquals("newspapers have multiple authors", item.getAuthor());

        item  = new Book("Book");
        Assertions.assertEquals("Unknown", item.getAuthor());
    }
}
