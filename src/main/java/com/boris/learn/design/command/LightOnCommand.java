package com.boris.learn.design.command;

public class LightOnCommand implements Command {
    private Light light;
    //记录上一次灯光的亮度 用于undo
    private int level;

    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        this.level = light.getLevel();
        light.on();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
