package com.dotuian.dp.observer;

public class ConcreteSubject extends Subject {

    public void change(String newState) {
        this.setState(newState);

        System.out.println("主题状态为：" + this.getState());

        this.nodifyObservers();
    }

}
