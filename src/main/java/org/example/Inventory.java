package org.example;

import java.util.List;
import java.util.Map;

public class Inventory {
private Map<String, List<String>> stock;

  public List<String> project(String date) {
    return null;
  }

  public void add(String date, String fruit) {
    stock.put(date, List.of(fruit));
  }
}
