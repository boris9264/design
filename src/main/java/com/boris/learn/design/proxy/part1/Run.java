package com.boris.learn.design.proxy.part1;

public class Run {
    public static void main(String[] args) {
        IUserDao userDao = new UserDao();
        UserDaoProxy userDaoProxy = new UserDaoProxy(userDao);
        userDaoProxy.save();
    }
}
