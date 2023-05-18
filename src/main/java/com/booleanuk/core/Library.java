package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Item> items;

    public Library(){
        this.items = new ArrayList<>();
    }

    public void addToStock(Item item) {
        this.items.add(item);
    }


    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInItem(String title) {
        for(Item item : this.items){
            if(item.title.equals(title)){
                return item.checkIn();
            }
        }
        return "item is not part of the library's collection";
    }

    public String checkOutItem(String title) {
        for(Item item : this.items){
            if(item.title.equals(title)){
                return item.checkOut();
            }
        }
        return "item is not part of the library's collection";
    }
}
