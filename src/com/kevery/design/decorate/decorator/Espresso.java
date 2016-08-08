package com.kevery.design.decorate.decorator;

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
