package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTest {

    private Product product;

    @BeforeEach
    public void setUp() {
        product = new Product("Something");
    }

    @Test
    public void testCheckIn() {
        Assertions.assertEquals("item is not currently on loan", product.checkIn());
        Assertions.assertFalse(product.isOnLoan());
    }

    @Test
    public void testCheckIn2() {
        product.checkOut();
        Assertions.assertEquals("item has been checked in", product.checkIn());
        Assertions.assertFalse(product.isOnLoan());
    }

    @Test
    public void testCheckOut() {
        product.checkOut();
        Assertions.assertEquals("item is currently on loan", product.checkOut());
        Assertions.assertTrue(product.isOnLoan());
    }

    @Test
    public void testCheckOut2() {;
        Assertions.assertEquals("item has been checked out", product.checkOut());
        Assertions.assertTrue(product.isOnLoan());
    }


}
