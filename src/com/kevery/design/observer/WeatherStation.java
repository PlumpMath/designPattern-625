package com.kevery.design.observer;

import com.kevery.design.observer.impl.CurrentConditionDisplay;
import com.kevery.design.observer.impl.WeatherData;

/**
 * Created by kever
 * 16/8/1.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(20,40,50);
    }
}
