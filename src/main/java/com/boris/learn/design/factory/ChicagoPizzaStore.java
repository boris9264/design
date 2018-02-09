package com.boris.learn.design.factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("chicago")) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}
