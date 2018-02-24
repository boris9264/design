package com.boris.learn.design.command;

public interface Command {
    void execute();

    void undo();
}
