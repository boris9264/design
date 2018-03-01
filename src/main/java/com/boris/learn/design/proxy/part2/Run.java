package com.boris.learn.design.proxy.part2;

public class Run {
    public static void main(String[] args) {
        IUserDao target = new UserDao();
        System.out.println(target.getClass());

        IUserDao proxy = (IUserDao) new ProxyFactory(target).getProxyInstance();
        System.out.println(proxy.getClass());
        proxy.save("test");
    }
}
