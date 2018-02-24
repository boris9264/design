package com.boris.learn.design.command;

public class LightOffCommand implements Command {
    private Light light;
    private int level;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.level = light.getLevel();
        light.off();
    }

    @Override
    public void undo() {
        light.dim(level);
    }
}
