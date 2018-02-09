package com.boris.learn.design.decorate;

public class HouseBlend extends Beverage {
    public HouseBlend () {
        this.description = "House Blend coffee";
    }

    @Override
    public double cost() {
        return .96;
    }
}
