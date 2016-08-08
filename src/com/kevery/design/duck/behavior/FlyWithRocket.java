package com.kevery.design.duck.behavior;

/**
 * Created by kever
 * 16/7/21.
 */
public class FlyWithRocket implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with rocket!");
    }
}
