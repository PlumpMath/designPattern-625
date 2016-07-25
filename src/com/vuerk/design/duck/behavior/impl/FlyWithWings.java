package com.vuerk.design.duck.behavior.impl;

import com.vuerk.design.duck.behavior.FlyBehavior;

/**
 * Created by kever
 * 16/7/21.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("flying with wing");
    }
}
