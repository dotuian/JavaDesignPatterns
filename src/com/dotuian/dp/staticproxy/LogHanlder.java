package com.dotuian.dp.staticproxy;

public class LogHanlder implements Movable {

    private Movable m;

    public LogHanlder(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("Log start... ");
        m.move();
        System.out.println("Log end  ... ");
    }

}
