package com.dotuian.dp.state;

public class App {

    public static void main(String[] args) {
        
        Girl girl = new Girl();

        State happy = new HappyState();
        State sad = new SadState();

        girl.setState(happy);
        girl.cry();
        girl.say();

        System.out.println("======================");

        girl.setState(sad);
        girl.cry();
        girl.say();

    }

}
