package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LibraryTest {
	@Test
	public void addToStockLiteratureTest() {
		Library library = new Library();
		Author a1 = new Author("Hugh Mann");
		Author a2 = new Author("A. L. Ian");
		Literature li1 = new Book("Book Title", a1);
		Literature li2 = new Newspaper("Newspaper Title");
		Literature li3 = new Article("Article Title", a2);
		library.addToStock(li1);
		library.addToStock(li2);
		library.addToStock(li3);
		Assertions.assertEquals(3, library.literature.size());
		Assertions.assertTrue(library.literature.contains(li1));
		Assertions.assertTrue(library.literature.contains(li2));
		Assertions.assertTrue(library.literature.contains(li3));

	}

	@Test
	public void testCheckInLiteratureTest() {
		Library library = new Library();
		Author a1 = new Author("Hugh Mann");
		Author a2 = new Author("A. L. Ian");
		Literature li1 = new Book("Book Title", a1);
		Literature li2 = new Newspaper("Newspaper Title");
		Literature li3 = new Article("Article Title", a2);
		library.addToStock(li1);
		library.addToStock(li2);
		library.addToStock(li3);
		String r1 = library.checkInLiterature("Book Title");
		String r2 = library.checkInLiterature("Newspaper Title");
		String r3 = library.checkInLiterature("Article Title");
		Assertions.assertEquals("item is not currently on loan", r1);
		Assertions.assertEquals("newspapers are not available for loan", r2);
		Assertions.assertEquals("item is not currently on loan", r3);

	}

	@Test
	public void testCheckOutLiteratureTest() {
		Library library = new Library();

		Author a1 = new Author("Hugh Mann");
		Author a2 = new Author("A. L. Ian");
		Literature li1 = new Book("Book Title", a1);
		Literature li2 = new Newspaper("Newspaper Title");
		Literature li3 = new Article("Article Title", a2);
		library.addToStock(li1);
		library.addToStock(li2);
		library.addToStock(li3);
		String r1 = library.checkOutLiterature("Book Title");
		String r2 = library.checkOutLiterature("Newspaper Title");
		String r3 = library.checkOutLiterature("Article Title");
		Assertions.assertEquals("item has been checked out", r1);
		Assertions.assertEquals("newspapers are not available for loan", r2);
		Assertions.assertEquals("item has been checked out", r3);

	}

	@Test
	public void testCheckInNonExistingLiteratureTest() {
		Library library = new Library();

		String result = library.checkInLiterature("Nonexistent Title");

		Assertions.assertEquals("item is not part of the library's collection", result);
	}

	@Test
	public void testCheckOutNonExistingLiteratureTest() {
		Library library = new Library();

		String result = library.checkOutLiterature("Nonexistent Title");

		Assertions.assertEquals("item is not part of the library's collection", result);
	}
}
