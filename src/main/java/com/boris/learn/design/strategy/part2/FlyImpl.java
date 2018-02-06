package com.boris.learn.design.strategy.part2;

public class FlyImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying....");
    }
}
