package com.boris.learn.design.decorate;

public class Run {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        espresso = new Soy(espresso);
        espresso = new Whip(espresso);
        System.out.println(espresso.getDescription());
        System.out.println(espresso.cost());
    }
}
