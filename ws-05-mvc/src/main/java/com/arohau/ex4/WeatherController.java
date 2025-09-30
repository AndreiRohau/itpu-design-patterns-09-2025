package com.arohau.ex4;

public class WeatherController {
    private final WeatherStation facadeModel;

    public WeatherController(WeatherStation model) {
        this.facadeModel = model;
    }

    public void writeCelsiusAndWriteHumidity(Double celsius, Double humidity) {
        facadeModel.writeCelsiusAndWriteHumidity(celsius, humidity);
    }
}
