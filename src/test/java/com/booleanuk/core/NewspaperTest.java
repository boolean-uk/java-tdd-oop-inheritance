package com.booleanuk.core;

import com.booleanuk.core.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NewspaperTest {

    @Test
    public void shouldBeUnavailableForCheckIn() {
        Library library = new Library();
        Newspaper newspaper = new Newspaper("The Daily Java");
        library.addToStock(newspaper);

        Assertions.assertEquals("newspapers are not available for loan", library.checkInItem("The Daily Java"));
    }

    @Test
    public void shouldBeUnavailableForCheckOut() {
        Library library = new Library();
        Newspaper newspaper = new Newspaper("The Daily Java");
        library.addToStock(newspaper);

        Assertions.assertEquals("newspapers are not available for loan", library.checkOutItem("The Daily Java"));
    }
}
