package com.boris.learn.design.templete;

public class Run {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("----------------------------------------------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();
    }
}
