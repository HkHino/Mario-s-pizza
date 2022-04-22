package com.company;

import java.util.ArrayList;

public class Order {
  private ArrayList<Pizza> Order;
  private String time;
  Order(String time) {
    this.time = time;
  }
  public void addPizzaToOrder(Pizza pizza){
    Order.add(pizza);
  }
}
