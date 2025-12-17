package com.arohau.strategy.ex3_0;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        ChristmasDiscounter christmasDiscounter = new ChristmasDiscounter();

        Discounter easterDiscounter = new EasterDiscounter();
        BigDecimal discountedValue = easterDiscounter.apply(BigDecimal.valueOf(100));
        System.out.println(discountedValue.equals(BigDecimal.valueOf(50.0)));

        // anonymous discounter solution
        Discounter birthdayDiscount = new Discounter() {
            @Override
            public BigDecimal apply(BigDecimal amount) {
                return  amount.multiply(BigDecimal.valueOf(0.8));
            }
        };
        System.out.println(birthdayDiscount.apply(BigDecimal.valueOf(100)).equals(BigDecimal.valueOf(80.0)));

        // declarative style solution
        Discounter eightMarchDiscounter = amount -> amount.multiply(BigDecimal.valueOf(0.7));
        System.out.println(eightMarchDiscounter.apply(BigDecimal.valueOf(100)).equals(BigDecimal.valueOf(70.0)));
        System.out.println("---------------------");
        System.out.println("---------------------");
        System.out.println("---------------------");
        ShopContext shopContext = new ShopContext(null);

        shopContext.setDiscounter(christmasDiscounter);
        System.out.println(shopContext.payWithDiscount(BigDecimal.valueOf(100)).equals(BigDecimal.valueOf(90.0)));

        shopContext.setDiscounter(birthdayDiscount);
        System.out.println(shopContext.payWithDiscount(BigDecimal.valueOf(100)).equals(BigDecimal.valueOf(80.0)));

        shopContext.setDiscounter(eightMarchDiscounter);
        System.out.println(shopContext.payWithDiscount(BigDecimal.valueOf(100)).equals(BigDecimal.valueOf(70.0)));

        shopContext.setDiscounter(easterDiscounter);
        System.out.println(shopContext.payWithDiscount(BigDecimal.valueOf(100)).equals(BigDecimal.valueOf(50.0)));

    }
}
