package com.dotuian.dp.factory.abstractfactory.gree;

import com.dotuian.dp.factory.abstractfactory.WashingMachine;

public class GreeWashMachine extends WashingMachine {

    @Override
    public void wash() {
        System.out.println("格力洗衣机！！！");
    }

}
