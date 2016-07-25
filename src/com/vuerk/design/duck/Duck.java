package com.vuerk.design.duck;

import com.vuerk.design.duck.behavior.FlyBehavior;
import com.vuerk.design.duck.behavior.QuackBehavior;

/**
 * Created by kever
 * 16/7/21.
 * 鸭子类
 */
public class Duck {
    private String height;
    private String wight;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWight() {
        return wight;
    }

    public void setWight(String wight) {
        this.wight = wight;
    }
    public void performQuack(){
        quackBehavior.quack();
    }
    public void performFly(){
        flyBehavior.fly();
    }

    @Override
    public String toString() {
        return "Duck{" +
                "height='" + height + '\'' +
                ", wight='" + wight + '\'' +
                ", flyBehavior=" + flyBehavior +
                ", quackBehavior=" + quackBehavior +
                '}';
    }
}
