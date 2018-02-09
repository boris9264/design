package com.boris.learn.design.decorate;

public class Espresso extends Beverage {

    public Espresso() {
        this.description = "Espresso";
    }

    @Override
    public double cost() {
        return .89;
    }
}
