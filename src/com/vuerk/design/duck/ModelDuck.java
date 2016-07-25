package com.vuerk.design.duck;

import com.vuerk.design.duck.behavior.impl.FlyNoWay;

/**
 * Created by kever
 * 16/7/21.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior=new FlyNoWay();
    }
}
