package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.Test;

class InventoryTest {

  private Inventory inventory;

  private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

  private final LocalDate today = LocalDate.parse("08/11/2024", formatter);

  private final LocalDate yesterday = LocalDate.parse("07/11/2024", formatter);

  @Test
  void addProductToday() {
    this.inventory = new Inventory();
    this.inventory.add(today, "Banana");
    assertThat(this.inventory.project(today)).contains("Banana");
  }

  @Test
  void addProductsToday() {
    this.inventory = new Inventory();
    this.inventory.add(today, "Banana");
    this.inventory.add(today, "Apple");
    assertThat(this.inventory.project(today)).containsExactly("Banana", "Apple");
  }

  @Test
  void addProductYesterday() {
    this.inventory = new Inventory();
    this.inventory.add(today, "Banana");
    this.inventory.add(yesterday, "Apple");
    assertThat(this.inventory.project(today)).containsExactly("Banana", "Apple");
  }
}
