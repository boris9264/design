package com.boris.learn.design.singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton() {
        System.out.println("Singleton init...");
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }
}
