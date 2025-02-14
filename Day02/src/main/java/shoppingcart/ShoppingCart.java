package shoppingcart;

import java.util.*;

public class ShoppingCart {
    private final HashMap<String, Double> productPrices;
    private final LinkedHashMap<String, Integer> cart;
    private final TreeMap<Double, String> sortedCart;

    public ShoppingCart() {
        this.productPrices = new HashMap<>();
        this.cart = new LinkedHashMap<>();
        this.sortedCart = new TreeMap<>();
    }

    public void addProduct(String name, double price) {
        productPrices.put(name, price);
    }

    public void addToCart(String name, int quantity) {
        if (!productPrices.containsKey(name)) {
            throw new IllegalArgumentException("Product not found");
        }
        cart.put(name, cart.getOrDefault(name, 0) + quantity);
        sortedCart.put(productPrices.get(name), name);
    }

    public LinkedHashMap<String, Integer> viewCart() {
        return new LinkedHashMap<>(cart);
    }

    public TreeMap<Double, String> viewCartSortedByPrice() {
        return new TreeMap<>(sortedCart);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            total += productPrices.get(entry.getKey()) * entry.getValue();
        }
        return total;
    }
}