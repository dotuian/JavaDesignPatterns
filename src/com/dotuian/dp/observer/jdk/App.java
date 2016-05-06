package com.dotuian.dp.observer.jdk;

import java.util.Date;

public class App {

    public static void main(String[] args) {

        // 观察者
        Watcher watcher = new Watcher();

        // 被观察者
        Watched watched = new Watched();
        watched.addObserver(watcher);

        watched.setData(new Date().toString());

    }

}
