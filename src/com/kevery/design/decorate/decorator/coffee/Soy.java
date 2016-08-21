package com.kevery.design.decorate.decorator.coffee;

/**
 * Created by kever
 * 16/8/8.
 */
public class Soy extends Beverage {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
