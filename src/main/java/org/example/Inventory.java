package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
private final Map<String, ArrayList<String>> stock = new HashMap<>();

  public List<String> project(String date) {
    return this.stock.get(date);
  }

  public void add(String date, String fruit) {
    if (this.stock.containsKey(date)) {
        this.stock.get(date).add(fruit);
    }else {
      this.stock.put(date, new ArrayList<>(List.of(fruit)));
    }

  }
}
