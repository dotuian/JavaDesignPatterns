package com.dotuian.dp.dymaicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class App {

    public static void main(String[] args) {
        Car car = new Car();

        InvocationHandler log = new LogHandler(car);
        InvocationHandler time = new TimeHandler(car);
        

        Movable m1 = (Movable) Proxy.newProxyInstance(App.class.getClassLoader(), car.getClass().getInterfaces(), log);
//        m1.move();

        System.out.println("===========================");

        Movable m2 = (Movable) Proxy.newProxyInstance(App.class.getClassLoader(), car.getClass().getInterfaces(), time);
//        m2.move();
        
        System.out.println("===========================");
        
        Movable m4 = (Movable) Proxy.newProxyInstance(App.class.getClassLoader(), car.getClass().getInterfaces(), time);
        Movable m5 = (Movable) Proxy.newProxyInstance(App.class.getClassLoader(), m4.getClass().getInterfaces(), log);
        m5.move();
    }
}
