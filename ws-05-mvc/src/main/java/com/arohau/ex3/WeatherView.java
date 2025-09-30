package com.arohau.ex3;

public class WeatherView implements Observer {
    private Thermometer model;

    public WeatherView(Thermometer model) {
        this.model = model;
        model.registerObserver(this);
    }

    @Override
    public void update() {
        displayTemperature(model.getCelsius(), model.readFahrenheit(), model.readKelvin());
    }

    public void displayTemperature(double celsius, double fahrenheit, double kelvin) {
        System.out.println("Temperature:");
        System.out.printf("\t%g Celsius\n", celsius);
        System.out.printf("\t%g Fahrenheit\n", fahrenheit);
        System.out.printf("\t%g Kelvin\n", kelvin);
    }
}