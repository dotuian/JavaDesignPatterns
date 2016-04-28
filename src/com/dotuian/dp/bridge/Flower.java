package com.dotuian.dp.bridge;

public class Flower implements Gift {

    @Override
    public void send() {
        System.out.println("鲜花！");
    }

}
