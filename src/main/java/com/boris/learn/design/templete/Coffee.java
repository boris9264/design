package com.boris.learn.design.templete;

public class Coffee extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping coffee through filter");
    }
}
