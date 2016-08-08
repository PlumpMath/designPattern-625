package com.kevery.design.decorate.decorator;

/**
 * Created by kever
 * 16/8/8.
 */
public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription()+"$"+beverage.cost());
        Beverage beverage1=new Espresso();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Soy(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription()+"$"+beverage1.cost());

    }
}
