package com.boris.learn.design.command;

public class DimmerLightOnCommand implements Command {
    private Light light;
    private int level;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        level = light.getLevel();
        light.dim(75);
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
