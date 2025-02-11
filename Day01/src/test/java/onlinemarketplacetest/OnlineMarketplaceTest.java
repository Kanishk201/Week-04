package onlinemarketplacetest;

import dynamiconlinemarketplace.BookCategory;
import dynamiconlinemarketplace.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OnlineMarketplaceTest {
    @Test
    void testProductCreation() {
        Product<BookCategory> book = new Product<>("Java Programming", 50.0, new BookCategory());
        assertEquals("Books", book.getCategoryName());
        assertEquals(50.0, book.getPrice());
    }
}

