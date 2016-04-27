package com.dotuian.dp.factory.abstractfactory.haier;

import com.dotuian.dp.factory.abstractfactory.WashingMachine;

public class HaierWashMachine extends WashingMachine {

    @Override
    public void wash() {
        System.out.println("海尔洗衣机！！！");
    }

}
