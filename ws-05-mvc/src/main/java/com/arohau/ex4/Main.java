package com.arohau.ex4;

/**
 * Example With the Model Facade
 */
public class Main {
    public static void main(String[] args) {
        // Create Model, View, and Controller
        WeatherStation facadeModel = new WeatherStation(new Thermometer(), new Hygrometer());
        WeatherView view = new WeatherView(facadeModel);
        System.out.println("Basic status");
        view.update();

        WeatherController controller = new WeatherController(facadeModel);
        // Change Weather Station data using Controller
        controller.writeCelsiusAndWriteHumidity(20.0, 85.0);
        controller.writeCelsiusAndWriteHumidity(30.0, 95.0);
        facadeModel.removeObserver(view);
    }
}