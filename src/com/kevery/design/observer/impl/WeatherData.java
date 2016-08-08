package com.kevery.design.observer.impl;

import com.kevery.design.observer.Observer;
import com.kevery.design.observer.Subject;

import java.util.ArrayList;

/**
 * Created by kever
 * 16/7/28.
 */
public class WeatherData implements Subject {
    private ArrayList list;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        list = new ArrayList();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Object o : list) {
            Observer observer = (Observer) o;
            observer.update(temperature,humidity,pressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature=temperature;
        this.humidity= humidity;
        this.pressure=pressure;
        notifyObserver();
    }
    public void dataChange() {
        notifyObserver();
    }

    void getTEmbrasure() {

    }

    void getHumidity() {

    }

    void getPressure() {

    }
}
