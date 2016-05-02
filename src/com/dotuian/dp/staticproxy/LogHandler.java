package com.dotuian.dp.staticproxy;

public class LogHandler implements Movable {

    private Movable m;

    public LogHandler(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("Log start... ");
        m.move();
        System.out.println("Log end  ... ");
    }

}
