package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Item> items;

    public Library(){
        items = new ArrayList<>();
    }
    public void addToStock(Item item) {
        this.items.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInItem(String title) {
        try {
            List<Item> filtered = this.items.stream()
                    .filter(item -> item.title.equals(title))
                    .toList();

            return filtered.get(0).checkIn();
        } catch (Exception e){
            return "item is not part of the library's collection";
        }
    }

    public String checkOutItem(String title) {
        try {
            List<Item> filtered = this.items.stream()
                    .filter(item -> item.getTitle().equals(title))
                    .toList();
            return filtered.get(0).checkOut();
        } catch (Exception e){
            return "item is not part of the library's collection";
        }
    }
    public Item getItemFromName(String title) {
        try{
            for(Item i : items){
                if(i.getTitle().equals(title)){
                    return i;
                }
            }
        } catch (Exception e){
            return null;
        }
        return null;
    }


}
