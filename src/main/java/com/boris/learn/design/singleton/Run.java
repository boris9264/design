package com.boris.learn.design.singleton;

public class Run {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton = Singleton.getInstance();
    }
}
