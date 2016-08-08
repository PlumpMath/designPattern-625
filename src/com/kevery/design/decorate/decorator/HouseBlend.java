package com.kevery.design.decorate.decorator;

/**
 * Created by kever
 * 16/8/8.
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
