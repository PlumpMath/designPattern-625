package com.kevery.design.observer.buildIn;

import com.kevery.design.observer.DisplayAble;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by kever
 * 16/8/1.
 */
public class CurrentConditionDisplay implements Observer, DisplayAble {
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Observable observable) {
        Observable observable1 = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println(temperature + "," + humidity);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }
}
