package com.boris.learn.design.strategy.part2;

public class Run {
    public static void main(String[] args) {
        Duck greenDuck = new GreenDuck();
        greenDuck.fly();
        greenDuck.quack();
        greenDuck.swim();
        greenDuck.display();

        System.out.println("========================================");

        Duck redDuck = new RedDuck();
        redDuck.fly();
        redDuck.setFlyBehavior(new FlyNoWayImpl());
        redDuck.fly();
        redDuck.quack();
        redDuck.swim();
        redDuck.display();
    }
}
