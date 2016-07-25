package com.vuerk.design.duck.behavior.impl;

import com.vuerk.design.duck.behavior.QuackBehavior;

/**
 * Created by kever
 * 16/7/21.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("吱吱叫");
    }
}
