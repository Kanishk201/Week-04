package smartwarehousesystemtest;

import org.junit.Assert;
import org.junit.Test;
import smartwarehousemanagementsystem.Electronics;
import smartwarehousemanagementsystem.Groceries;
import smartwarehousemanagementsystem.Storage;
import smartwarehousemanagementsystem.WarehouseItem;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SmartWarehouseTest {
  @Test
  public void testStorageFunctionality() {
    Storage<Electronics> electronicsStorage = new Storage<>();
    Electronics laptop = new Electronics("Laptop");
    electronicsStorage.addItem(laptop);

    assertEquals(1, electronicsStorage.getAllItems().size());
    assertEquals("Laptop", electronicsStorage.getAllItems().get(0).name);
  }
}
