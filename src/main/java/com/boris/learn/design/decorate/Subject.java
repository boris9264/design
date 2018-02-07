package com.boris.learn.design.decorate;

public interface Subject {
    //订阅
    void registerObserver(Observer o);

    //取消订阅
    void removeObserver(Observer o);

    //数据变更通知观察者
    void notifyObservers();
}
