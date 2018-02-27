package com.boris.learn.design.templete;

public class Tea extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public boolean customerWantsCondiments() {
        return true;
    }
}
