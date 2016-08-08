package com.kevery.design.decorate.decorator;

/**
 * Created by kever
 * 16/8/8.
 */
public class Whip extends Beverage {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return 0.4 + beverage.cost();
    }
}
