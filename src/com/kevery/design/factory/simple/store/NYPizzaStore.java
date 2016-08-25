package com.kevery.design.factory.simple.store;

import com.kevery.design.factory.simple.pizza.ChicagoStyleCheesePizza;
import com.kevery.design.factory.simple.pizza.NYPCheesePizza;
import com.kevery.design.factory.simple.pizza.Pizza;

/**
 * Created by kever
 * 16/8/9.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYPCheesePizza();
            case "clam":
                return new ChicagoStyleCheesePizza();
            default:
                return null;
        }
    }
}
