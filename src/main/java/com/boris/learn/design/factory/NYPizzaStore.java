package com.boris.learn.design.factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("NY")) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}
