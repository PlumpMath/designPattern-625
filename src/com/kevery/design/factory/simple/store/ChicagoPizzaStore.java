package com.kevery.design.factory.simple.store;

import com.kevery.design.factory.simple.pizza.ChicagoStyleCheesePizza;
import com.kevery.design.factory.simple.pizza.Pizza;

/**
 * Created by kever
 * 16/8/9.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            default:
                return null;
        }
    }
}
