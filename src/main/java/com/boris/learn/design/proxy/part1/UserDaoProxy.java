package com.boris.learn.design.proxy.part1;

public class UserDaoProxy implements IUserDao {
    private IUserDao target;

    public UserDaoProxy(IUserDao target) {
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("Begin transaction...");
        target.save();
        System.out.println("transaction commit...");
    }
}
