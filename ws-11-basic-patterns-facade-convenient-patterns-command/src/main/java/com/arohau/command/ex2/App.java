package com.arohau.command.ex2;

public class App {
    public static void main(String[] args) {
        Light light = new Light();
        light.isOn();

        LightCommandExecutor lightCommandExecutor = new LightCommandExecutor();

        lightCommandExecutor.executeCommand(new TurnOnLightCommand(light));
        light.isOn();

        lightCommandExecutor.executeCommand(new TurnOffLightCommand(light));
        light.isOn();
    }
}
