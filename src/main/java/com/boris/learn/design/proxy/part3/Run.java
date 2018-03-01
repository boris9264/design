package com.boris.learn.design.proxy.part3;

public class Run {
    public static void main(String[] args) {
        UserDao target = new UserDao();

        //代理对象
        UserDao proxy = (UserDao)new ProxyFactory(target).getProxyInstance();

        //执行代理对象的方法
        proxy.save2();
    }
}
