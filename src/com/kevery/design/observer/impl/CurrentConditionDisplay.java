package com.kevery.design.observer.impl;

import com.kevery.design.observer.DisplayAble;
import com.kevery.design.observer.Observer;
import com.kevery.design.observer.Subject;

/**
 * Created by kever
 * 16/8/1.
 */
public class CurrentConditionDisplay implements Observer,DisplayAble{
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition,temperature:"+temperature+"humidity:"+humidity);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature=temp;
        this.humidity=humidity;
        display();
    }
}
