package smartwarehousemanagementsystem;

public class SmartWarehouseMain {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apples"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        // Displaying all items
        System.out.println("Electronics:");
        WarehouseUtil.displayItems(electronicsStorage.getAllItems());

        System.out.println("\nGroceries:");
        WarehouseUtil.displayItems(groceriesStorage.getAllItems());

        System.out.println("\nFurniture:");
        WarehouseUtil.displayItems(furnitureStorage.getAllItems());
    }
}
