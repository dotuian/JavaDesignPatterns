package com.dotuian.dp.staticproxy;

import java.util.Random;

public class Car implements Movable {

    @Override
    public void move() {
        Random random = new Random();
        int count = random.nextInt(5);
        for (int i = 0; i < count; i++) {
            System.out.println("car is moving ");
            try {
                Thread.sleep(new Random().nextInt(1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
