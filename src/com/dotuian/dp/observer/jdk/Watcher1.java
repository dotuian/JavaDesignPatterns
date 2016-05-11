package com.dotuian.dp.observer.jdk;

import java.util.Observable;
import java.util.Observer;

public class Watcher1 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("==== 观察者1 ==== ");

        if (arg instanceof Watched) {
            Watched w1 = (Watched) arg;
            System.out.println(w1.getData());

        }

        if (o instanceof Watched) {
            Watched w2 = (Watched) o;
            System.out.println(w2.getData());
        }

    }

}
