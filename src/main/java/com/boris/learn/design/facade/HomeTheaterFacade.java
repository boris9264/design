package com.boris.learn.design.facade;

public class HomeTheaterFacade {
    private Dvd dvd = new Dvd();
    private Projector projector = new Projector();
    private Screen screen = new Screen();

    public void watchMovie() {
        screen.down();
        projector.on();
        dvd.on();
    }

    public void endMovie() {
        screen.up();
        projector.off();
        dvd.off();
    }
}
