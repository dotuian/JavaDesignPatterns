package com.dotuian.dp.staticproxy;

import java.util.Date;

public class TimeHanlder implements Movable {

    private Movable m;

    public TimeHanlder(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println(new Date().toString());
        m.move();
        System.out.println(new Date().toString());
    }

}
