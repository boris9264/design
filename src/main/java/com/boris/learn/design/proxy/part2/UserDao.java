package com.boris.learn.design.proxy.part2;

public class UserDao implements IUserDao {
    @Override
    public void save(String desc) {
        System.out.println(desc + " save...");
    }
}
