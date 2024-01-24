package com.booleanuk.core;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Author author = new Author("George Lucas", 123456, "www.lol.dk");

        Item item_1 = new Article("sw1");
        Item item_2 = new Book("sw2");
        Item item_3 = new Newspaper("sw3");
        Item item_4 = new Article("sw4");

        Item item_5 = new Article("sw5", author);

        library.addToStock(item_1);
        library.addToStock(item_2);
        library.addToStock(item_3);
        library.addToStock(item_4);
        library.addToStock(item_5);

        System.out.println(library.checkInArticle("sw1"));
        System.out.println(library.checkOutArticle("sw1"));

        System.out.println(library.checkInArticle("sw2"));
        System.out.println(library.checkOutArticle("sw2"));

        System.out.println(library.checkInArticle("sw3"));
        System.out.println(library.checkOutArticle("sw3"));

        System.out.println(library.checkInArticle("sw4"));
        System.out.println(library.checkOutArticle("sw4"));

        System.out.println(library.checkInArticle("sw5"));
        System.out.println(library.checkOutArticle("sw5"));

    }
}
