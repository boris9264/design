package com.boris.learn.design.command;

public class Light {
    private String location;
    private int level;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        this.level=100;
        System.out.println("Light is on...");
    }

    public void off() {
        this.level=0;
        System.out.println("Light is off...");
    }

    //调整亮度
    public void dim(int level) {
        this.level = level;
        if (level==0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    //获取亮度
    public int getLevel() {
        return level;
    }
}
