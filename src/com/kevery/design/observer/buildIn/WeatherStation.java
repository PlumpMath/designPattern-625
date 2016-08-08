package com.kevery.design.observer.buildIn;

/**
 * Created by kever
 * 16/8/1.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(40, 20, 50);
    }
}
