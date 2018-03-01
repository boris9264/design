package com.boris.learn.design.templete;

public class Run {
    public static void main(String[] args) {
        CaffeineBeverage coffee = new Coffee();
        coffee.prepareRecipe();
        System.out.println("----------------------------------------------");
        CaffeineBeverage tea = new Tea();
        tea.prepareRecipe();

        System.out.println(Run.add100(100));
    }

    public static int add100(int i) {
        return i==1?1:i + Run.add100(i-1);
    }
}
