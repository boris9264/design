package com.boris.learn.design.facade;

public class Run {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();
        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
    }
}
