package com.dotuian.dp.singleton;

/**
 * 单例模式
 * 
 * @author SHOU
 *
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }

}
