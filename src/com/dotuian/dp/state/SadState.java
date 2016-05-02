package com.dotuian.dp.state;

public class SadState implements State {

    @Override
    public void cry() {
        System.out.println("悲伤地哭！");
    }

    @Override
    public void say() {
        System.out.println("悲伤地说！");
    }

}
