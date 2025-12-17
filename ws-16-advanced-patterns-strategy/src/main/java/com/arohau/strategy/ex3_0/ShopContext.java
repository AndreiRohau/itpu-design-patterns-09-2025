package com.arohau.strategy.ex3_0;

import java.math.BigDecimal;

public class ShopContext {
    private Discounter discounter;

    public ShopContext(Discounter discounter) {
        this.discounter = discounter;
    }

    public void setDiscounter(Discounter discounter) {
        this.discounter = discounter;
    }

    public BigDecimal payWithDiscount(BigDecimal amount) {
        return discounter.apply(amount);
    }
}
