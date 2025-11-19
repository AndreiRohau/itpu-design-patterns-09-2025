package com.arohau.builder.ex3;

import lombok.ToString;

@ToString(callSuper = true)
public class Car extends Vehicle {

    private String make;
    private String model;

    private Car(CarBuilder builder) {
        super(builder);
        this.make = builder.make;
        this.model = builder.model;
    }

    // Standard Getter methods..
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public static class CarBuilder extends VehicleBuilder {

        protected String make;
        protected String model;

        @Override
        public CarBuilder colour(String colour) {
            super.colour(colour);
            return this;
        }

        @Override
        public CarBuilder fuelType(String fuelType) {
            super.fuelType(fuelType);
            return this;
        }

        public CarBuilder make(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
