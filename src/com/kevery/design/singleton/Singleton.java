package com.kevery.design.singleton;

/**
 * Created by kever
 * 16/8/10.
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();

        }
        return singleton;
    }
}
