package com.dotuian.dp.staticproxy;

import java.util.Date;

public class TimeHandler implements Movable {

    private Movable m;

    public TimeHandler(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println(new Date().toString());
        m.move();
        System.out.println(new Date().toString());
    }

}
