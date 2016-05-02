package com.dotuian.dp.staticproxy;

public class App {

    public static void main(String[] args) {

        Movable m = new Car();

        Movable logHandler = new LogHandler(m);
        Movable timeHandler = new TimeHandler(logHandler);
        timeHandler.move();

        // Mon May 02 16:13:17 JST 2016
        // Log start...
        // car is moving
        // car is moving
        // car is moving
        // Log end ...
        // Mon May 02 16:13:19 JST 2016

        System.out.println("====================");

        Movable timeHandler2 = new TimeHandler(m);
        Movable logHandler2 = new LogHandler(timeHandler2);
        logHandler2.move();
        // Log start...
        // Mon May 02 16:28:28 JST 2016
        // car is moving
        // car is moving
        // Mon May 02 16:28:28 JST 2016
        // Log end ...

    }

}
