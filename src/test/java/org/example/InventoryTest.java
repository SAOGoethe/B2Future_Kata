package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InventoryTest {

  private Inventory inventory;

  @Test
  void addProduct() {
    String date = "08/11/2024";
    inventory.add(date, "Banana");
    assertThat(inventory.project(date)).contains("Banana");
  }
}
