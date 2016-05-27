package com.dotuian.dp2.factory.abstractfactory;

public class AmdCpu implements Cpu {

    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        System.out.println("AMD CPU的针脚数： " + this.pins);
    }
}
