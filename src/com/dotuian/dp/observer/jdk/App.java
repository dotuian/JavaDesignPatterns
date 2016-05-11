package com.dotuian.dp.observer.jdk;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        // 观察者1
        Watcher1 watcher1 = new Watcher1();
        // 观察者2
        Watcher2 watcher2 = new Watcher2();

        // 被观察者
        Watched watched = new Watched();
        watched.addObserver(watcher1);
        watched.addObserver(watcher2);

        watched.setData(new Date().toString());

    }

}
