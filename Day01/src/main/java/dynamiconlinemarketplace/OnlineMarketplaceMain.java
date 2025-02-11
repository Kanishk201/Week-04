package dynamiconlinemarketplace;

import java.util.ArrayList;
import java.util.List;

public class OnlineMarketplaceMain {
    public static void main(String[] args) {
        List<Product<?>> catalog = new ArrayList<>();

        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 20.0, new ClothingCategory());
        Product<GadgetCategory> smartphone = new Product<>("Smartphone", 500.0, new GadgetCategory());

        catalog.add(book);
        catalog.add(shirt);
        catalog.add(smartphone);

        System.out.println("Before Discount:");
        catalog.forEach(System.out::println);


        MarketplaceUtil.applyDiscount(book, 10);
        MarketplaceUtil.applyDiscount(shirt, 5);
        MarketplaceUtil.applyDiscount(smartphone, 15);

        System.out.println("\nAfter Discount:");
        catalog.forEach(System.out::println);
    }
}

