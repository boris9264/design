package com.boris.learn.design.factory;

public class Run {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza nyPizza = nyStore.orderPizza("NY");
        System.out.println("============================================================");
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        Pizza chicagoPizza = chicagoStore.orderPizza("chicago");
    }
}
