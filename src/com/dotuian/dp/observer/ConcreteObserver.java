package com.dotuian.dp.observer;

public class ConcreteObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
        this.observerState = subject.getState();
        System.out.println("观察者状态为：" + this.observerState);
    }

}
