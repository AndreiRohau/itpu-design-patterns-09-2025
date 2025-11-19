package com.arohau.builder.ex3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car.CarBuilder()
                .make("Ford2")
                .model("F")
                .fuelType("Petrol")
                .colour("red")
                .build();

        System.out.println(car);
    }
}
