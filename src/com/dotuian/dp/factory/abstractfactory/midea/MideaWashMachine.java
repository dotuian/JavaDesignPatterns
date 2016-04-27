package com.dotuian.dp.factory.abstractfactory.midea;

import com.dotuian.dp.factory.abstractfactory.WashingMachine;

public class MideaWashMachine extends WashingMachine {

    @Override
    public void wash() {
        System.out.println("美的洗衣机！！！");
    }

}
