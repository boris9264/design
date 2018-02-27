package com.boris.learn.design.templete;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    //加入调料
    public abstract void addCondiments();

    //制作
    public abstract void brew();

    //加水
    public void boilWater() {
        System.out.println("Boiling water");
    }

    //装杯
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // 我们在这里定义了一个方法，（通常）是空的缺省实现。这个方法只会返回true，不做别的事。
    // 这就是一个钩子，子类可以覆盖这个方法，但不见得一定要这么做。
    public boolean customerWantsCondiments() {
        return false;
    }
}
