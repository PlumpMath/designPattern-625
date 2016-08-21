package com.kevery.design.factory.simple.factory;

import com.kevery.design.factory.simple.pizza.CheesePizza;
import com.kevery.design.factory.simple.pizza.ClamPizza;
import com.kevery.design.factory.simple.pizza.Pizza;

/**
 * Created by kever
 * 16/8/9.
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }


}
