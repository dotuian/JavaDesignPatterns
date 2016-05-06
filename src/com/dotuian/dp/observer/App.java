package com.dotuian.dp.observer;

public class App {

    public static void main(String[] args) {
        // 观察者
        Observer observer = new ConcreteObserver();

        // 被观察者
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(observer);

        subject.change("test");
    }

}
