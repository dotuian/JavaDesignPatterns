package com.dotuian.dp.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    private Adapter() {
    }

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void sampleOperation1() {
        this.adaptee.sampleOperation1();
    }

    @Override
    public void sampleOperation2() {
        // TODO
    }

}
