package shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.0);
        cart.addProduct("Banana", 0.5);
        cart.addToCart("Apple", 3);
        cart.addToCart("Banana", 5);

        System.out.println("Cart Contents: " + cart.viewCart());
        System.out.println("Sorted Cart by Price: " + cart.viewCartSortedByPrice());
        System.out.println("Total Price: " + cart.getTotalPrice());
    }
}
