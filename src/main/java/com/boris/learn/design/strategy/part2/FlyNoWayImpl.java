package com.boris.learn.design.strategy.part2;

public class FlyNoWayImpl implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly...");
    }
}
