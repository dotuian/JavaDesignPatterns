package com.dotuian.dp.staticproxy;

public class App {

    public static void main(String[] args) {

        Movable m = new Car();

//        Movable logHanlder = new LogHanlder(m);
//        Movable timeHandler = new TimeHanlder(logHanlder);
//        timeHandler.move();
        
//        Mon May 02 16:13:17 JST 2016
//        Log start... 
//        car is moving 
//        car is moving 
//        car is moving 
//        Log end  ... 
//        Mon May 02 16:13:19 JST 2016
        
        Movable timeHandler = new TimeHanlder(m);
        Movable logHanlder = new LogHanlder(timeHandler);
        logHanlder.move();

    }

}
