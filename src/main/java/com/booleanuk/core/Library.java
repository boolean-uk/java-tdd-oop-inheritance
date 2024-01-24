package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Library {
    ArrayList<Item> itemList;
    public Library(){
        this.itemList = new ArrayList<>();
    }
    public void addToStock(Item item){
        this.itemList.add(item);
    }

    // The following methods may contain code that you are unfamiliar with. The strange syntax of article -> something
    // is called a lambda expression (https://www.w3schools.com/java/java_lambda.asp)
    public String checkInItem(String title){
        List<Item> filtered = this.itemList.stream()
                .filter(item -> item.title.equals(title))
                .toList();
        if(filtered.isEmpty()){
            return "item is not part of the library's collection";
        }
        return filtered.get(0).checkIn();
    }

    public String checkOutItem(String title){
        List<Item> filtered = this.itemList.stream()
                .filter(item -> item.title.equals(title))
                .toList();
        if(filtered.isEmpty()){
            return "item is not part of the library's collection";
        }
        return filtered.get(0).checkOut();
    }

}
