package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
private final Map<LocalDate, ArrayList<String>> stock = new HashMap<>();

  public List<String> project(LocalDate date) {
    return this.stock.get(date);
  }

  public void add(LocalDate date, String fruit) {
    if (this.stock.containsKey(date)) {
        this.stock.get(date).add(fruit);
    }else {
      this.stock.put(date, new ArrayList<>(List.of(fruit)));
    }

  }
}
