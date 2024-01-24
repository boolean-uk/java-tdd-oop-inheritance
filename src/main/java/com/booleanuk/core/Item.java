package com.booleanuk.core;

public class Item {
  String title;
  boolean onLoan = false;

  Author author;
  public Item(String title){
      this.title = title;
  }
  public boolean isOnLoan(){
    return onLoan;
  }
  public String checkIn(){
    if(!isOnLoan()){
      return "item is not currently on loan";
    }
    this.onLoan = false;
    return "item has been checked in";
  }
  public String checkOut(){
    if(isOnLoan()){
      return "item is currently on loan";
    }
    this.onLoan = true;
    return "item has been checked out";
  }
}
