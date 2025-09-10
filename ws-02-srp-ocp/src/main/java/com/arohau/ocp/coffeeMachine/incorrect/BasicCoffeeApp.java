package com.arohau.ocp.coffeeMachine.incorrect;

import com.arohau.ocp.coffeeMachine.incorrect.domain.Coffee;
import com.arohau.ocp.coffeeMachine.incorrect.domain.CoffeeSelection;

public class BasicCoffeeApp {

    private BasicCoffeeMachine coffeeMachine;

    public BasicCoffeeApp(BasicCoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    public Coffee prepareCoffee(CoffeeSelection selection) throws CoffeeException {
        Coffee coffee = this.coffeeMachine.brewCoffee(selection);
        System.out.println("Coffee is ready!");
        return coffee;
    }
} // end CoffeeApp

