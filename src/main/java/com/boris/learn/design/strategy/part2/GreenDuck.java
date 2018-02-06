package com.boris.learn.design.strategy.part2;

public class GreenDuck extends Duck {
    public GreenDuck() {
        flyBehavior = new FlyNoWayImpl();
        quackBehavior = new QuackAaImpl();
    }
    @Override
    public void display() {
        System.out.println("I'm a greenDuck...");
    }
}
