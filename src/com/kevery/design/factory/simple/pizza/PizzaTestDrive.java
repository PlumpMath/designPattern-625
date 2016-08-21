package com.kevery.design.factory.simple.pizza;

import com.kevery.design.factory.simple.store.ChicagoPizzaStore;
import com.kevery.design.factory.simple.store.NYPizzaStore;
import com.kevery.design.factory.simple.store.PizzaStore;

/**
 * Created by kever
 * 16/8/9.
 */
public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chStore = new ChicagoPizzaStore();
        Pizza cheese = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a" + cheese.getName());
        Pizza cheese1 = chStore.orderPizza("cheese");
        System.out.println("Joel ordered a" + cheese1.getName());
    }
}
