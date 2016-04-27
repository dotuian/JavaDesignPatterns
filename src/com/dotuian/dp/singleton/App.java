package com.dotuian.dp.singleton;

public class App {

    public static void main(String[] args) {
        
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        
        if(s1 == s2) {
            System.out.print("是同一个对象！");
        } else {
            System.out.print("不是同一个对象！");
        }
        
    }

}
