package com.kevery.design.factory.simple.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kever
 * 16/8/9.
 */
public class Pizza {
    String name;
    String dough;
    String sauce;
    List toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepare" + name);
        System.out.println("Dough" + dough);
        System.out.println("Sauce" + sauce);
        for (Object topping : toppings) {
            System.out.println("    " + topping);
        }
    }

    void bake() {
        System.out.println("bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting thee pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public List getToppings() {
        return toppings;
    }

    public void setToppings(List toppings) {
        this.toppings = toppings;
    }
}
