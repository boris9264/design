package com.boris.learn.design.strategy.part2;

public class RedDuck extends Duck {
    public RedDuck() {
        flyBehavior = new FlyImpl();
        quackBehavior = new QuackOoImpl();
    }

    @Override
    public void display() {
        System.out.println("I'm a redDuck...");
    }
}
