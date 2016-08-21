package com.kevery.design.decorate.decorator.coffee;

/**
 * Created by kever
 * 16/8/5.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
