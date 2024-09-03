package Tests;

import catalogue.Basket;
import catalogue.BetterBasket;
import catalogue.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BetterBasketTest {
    @Test
    void AddMethodShouldIncrementQuantityIfItemsAreTheSame() {
        var product = new Product("0001", "40 inch LED HD TV", 269.00, 1 );
        var basket = new BetterBasket();
        basket.add(product);
        basket.add(product);
        assertEquals(2, product.getQuantity());
    }
    @Test
    void AddMethodShouldntIncrementIfItemsAreDifferent() {
        var product1 = new Product("0001", "40 inch LED HD TV", 269.00, 1 );
        var product2 = new Product("0002", "DAB Radio", 29.99, 1 );
        var basket = new BetterBasket();
        basket.add(product1);
        basket.add(product2);
        assertEquals(1, product1.getQuantity());
        assertEquals(1, product1.getQuantity());
    }
    @Test
    void RemoveMethodShouldDecrementTheQuantityWithMultipleItems() {
        var product1 = new Product("0001", "40 inch LED HD TV", 269.00, 1);
        var product2 = new Product("0002", "DAB Radio", 29.99, 1 );
        var basket = new Basket();
        basket.add(product2);
        basket.add(product1);
        basket.add(product1);
        basket.remove(product1);
        assertEquals(1, product1.getQuantity());
        assertEquals(1, product2.getQuantity());
    }
}