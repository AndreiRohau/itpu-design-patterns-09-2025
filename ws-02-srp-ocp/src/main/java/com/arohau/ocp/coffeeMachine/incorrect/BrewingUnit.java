package com.arohau.ocp.coffeeMachine.incorrect;

import com.arohau.ocp.coffeeMachine.incorrect.domain.Coffee;
import com.arohau.ocp.coffeeMachine.incorrect.domain.CoffeeSelection;
import com.arohau.ocp.coffeeMachine.incorrect.domain.GroundCoffee;

public class BrewingUnit {
    public Coffee brew(CoffeeSelection filterCoffee, GroundCoffee groundCoffee, int quantityWater) {
        return new Coffee(filterCoffee.name(), groundCoffee.getName(), quantityWater);
    }
}
