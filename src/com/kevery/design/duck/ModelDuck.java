package com.kevery.design.duck;

import com.kevery.design.duck.behavior.impl.FlyNoWay;

/**
 * Created by kever
 * 16/7/21.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior=new FlyNoWay();
    }
}
