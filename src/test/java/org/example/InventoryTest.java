package org.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class InventoryTest {

  private Inventory inventory;

  @Test
  void addProductToday() {
    final String date = "08/11/2024";
      this.inventory = new Inventory();
      this.inventory.add(date, "Banana");
    assertThat(this.inventory.project(date)).contains("Banana");
  }

  @Test
  void addProductsToday() {
    final String date = "08/11/2024";
    this.inventory = new Inventory();
    this.inventory.add(date, "Banana");
    this.inventory.add(date, "Apple");
    assertThat(this.inventory.project(date)).containsExactly("Banana", "Apple");
  }


  @Test
  void addProductYesterday(){
    final String yesterday = "07/11/2024";
    final String today = "08/11/2024";
      this.inventory = new Inventory();
    this.inventory.add(today, "Banana");
      this.inventory.add(yesterday, "Apple");
    assertThat(this.inventory.project(today)).containsExactly("Banana","Apple");
  }
}
