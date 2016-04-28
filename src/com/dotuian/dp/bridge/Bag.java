package com.dotuian.dp.bridge;

public class Bag implements Gift {

    @Override
    public void send() {
        System.out.println("包包！");
    }

}
