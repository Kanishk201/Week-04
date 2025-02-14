package shoppingcarttest;
import org.junit.jupiter.api.Test;
import shoppingcart.ShoppingCart;

import static org.junit.jupiter.api.Assertions.*;
public class ShoppingCartTest {
    @Test
    void testAddProductAndCart() {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct("Apple", 1.0);
        cart.addToCart("Apple", 3);
        assertEquals(3, cart.viewCart().get("Apple"));
    }
}