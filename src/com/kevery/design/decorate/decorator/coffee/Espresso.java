package com.kevery.design.decorate.decorator.coffee;

/**
 * Created by kever
 * 16/8/8.
 */
public class Espresso extends Beverage{
    @Override
    public double cost() {
        return 1.99;
    }
    public Espresso(){
        description="Espresso";
    }
}
