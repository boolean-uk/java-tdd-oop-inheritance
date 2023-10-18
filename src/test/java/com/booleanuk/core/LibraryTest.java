package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {

    @Test
    public void testCheckInWhenNotExist(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        lib.addToStock(new Article("dd"));
        String message = lib.checkIn("a");
        Assertions.assertEquals("item is not part of the library's collection", message);
    }
    @Test
    public void testCheckInWhenNotCheckedIn(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Article a = new Article("dd");
        lib.addToStock(a);
        String message = lib.checkIn("dd");
        Assertions.assertFalse(a.isOnLoan());
        Assertions.assertEquals("item is not currently on loan", message);
    }

    @Test
    public void testCheckOutWhenNotCheckedOut(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Article a = new Article("dd");
        lib.addToStock(a);
        String message = lib.checkOut("dd");
        Assertions.assertTrue(a.isOnLoan());
        Assertions.assertEquals("item has been checked out", message);
    }

    @Test
    public void testCheckOutCheckIn(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Article a = new Article("dd");
        lib.addToStock(a);
        lib.checkOut("dd");
        String message = lib.checkIn("dd");
        Assertions.assertFalse(a.isOnLoan());
        Assertions.assertEquals("item has been checked in", message);
    }

    @Test
    public void testCheckInWhenCheckedIn(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Article a = new Article("dd");
        lib.addToStock(a);
        lib.checkOut("dd");
        lib.checkIn("dd");
        String message = lib.checkIn("dd");
        Assertions.assertFalse(a.isOnLoan());
        Assertions.assertEquals("item is not currently on loan", message);
    }

    @Test
    public void testCheckOutWhenCheckedOut(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Article a = new Article("dd");
        lib.addToStock(a);
        lib.checkOut("dd");
        String message = lib.checkOut("dd");
        Assertions.assertTrue(a.isOnLoan());
        Assertions.assertEquals("item is currently on loan", message);
    }

    @Test
    public void testNewspaperCheckOut(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Newspaper a = new Newspaper("dd");
        lib.addToStock(a);
        lib.checkOut("dd");
        String message = lib.checkOut("dd");
        Assertions.assertFalse(a.isOnLoan());
        Assertions.assertEquals("newspapers are not available for loan", message);
    }

    @Test
    public void testNewspaperCheckIn(){
        Library lib = new Library();
        lib.addToStock(new Book("ssss"));
        Newspaper a = new Newspaper("dd");
        lib.addToStock(a);
        lib.checkOut("dd");
        String message = lib.checkIn("dd");
        Assertions.assertFalse(a.isOnLoan());
        Assertions.assertEquals("newspapers are not available for loan", message);
    }
}
