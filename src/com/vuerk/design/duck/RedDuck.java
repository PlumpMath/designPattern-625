package com.vuerk.design.duck;

import com.vuerk.design.duck.behavior.FlyWithRocket;
import com.vuerk.design.duck.behavior.impl.FlyWithWings;
import com.vuerk.design.duck.behavior.impl.Quack;

/**
 * Created by kever
 * 16/7/21.
 */

public class RedDuck extends Duck {
    public RedDuck() {
        flyBehavior=new FlyWithWings();
        quackBehavior=new Quack();
    }

    public static void main(String[] args) {
        Duck redDuck = new RedDuck();
        redDuck.performFly();
        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyWithRocket());
        modelDuck.performFly();
    }
}
