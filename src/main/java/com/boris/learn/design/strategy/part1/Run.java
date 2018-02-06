package com.boris.learn.design.strategy.part1;

public class Run {
    public static void main(String[] args) {
        RedDuck redDuck = new RedDuck();
        redDuck.quack();
        redDuck.swim();
        redDuck.display();

        BlackDuck blackDuck = new BlackDuck();
        blackDuck.quack();
        blackDuck.swim();
        blackDuck.display();
    }
}
