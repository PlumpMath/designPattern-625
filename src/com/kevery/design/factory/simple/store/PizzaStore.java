package com.kevery.design.factory.simple.store;

import com.kevery.design.factory.simple.factory.SimplePizzaFactory;
import com.kevery.design.factory.simple.pizza.Pizza;

/**
 * Created by kever
 * 16/8/9.
 */
public abstract class PizzaStore {
    public SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        return createPizza(type);
    }

    public PizzaStore() {
    }

    abstract Pizza createPizza(String type);
}
