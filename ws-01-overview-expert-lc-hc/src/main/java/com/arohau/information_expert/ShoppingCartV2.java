package com.arohau.information_expert;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ShoppingCartV2 {
    private List<Product> products = new ArrayList<>();
    private Double totalPrice = 0.0;
    private Double discount = 1.0;

    public void addProductToCartAndUpdateTotalPrice(Product product) {
        addProductToCart(product);
        updateTotalPriceWithDiscount();
    }

    public void addProductToCart(Product product) {
        products.add(product);
    }

    /**
     * Information_expert states, that total price calculation should be
     * implemented in class, which has all required data for such operation: list of products in cart=
     * @return total price
     */
    public Double getTotalPrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public void updateTotalPriceWithDiscount() {
        totalPrice = discount * getTotalPrice();
    }
}
