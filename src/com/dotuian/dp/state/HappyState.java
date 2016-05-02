package com.dotuian.dp.state;

public class HappyState implements State {

    @Override
    public void cry() {
        System.out.println("高兴地哭！");
    }

    @Override
    public void say() {
        System.out.println("高兴地说！");
    }

}
