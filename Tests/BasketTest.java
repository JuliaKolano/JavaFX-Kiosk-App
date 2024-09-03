package Tests;

import catalogue.Basket;
import catalogue.Product;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {
    @Test
    void RemoveMethodShouldMakeBasketNotContainTheItem() {
        var product = new Product("0001", "40 inch LED HD TV", 269.00, 1);
        var basket = new Basket();
        basket.add(product);
        basket.remove(product);
        assertFalse(basket.contains(product));
    }
}