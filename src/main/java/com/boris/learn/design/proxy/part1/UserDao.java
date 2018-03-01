package com.boris.learn.design.proxy.part1;

public class UserDao implements IUserDao {
    @Override
    public void save() {
        System.out.println("save...");
    }
}
