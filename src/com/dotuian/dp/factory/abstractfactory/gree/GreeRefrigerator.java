package com.dotuian.dp.factory.abstractfactory.gree;

import com.dotuian.dp.factory.abstractfactory.Refrigerator;

public class GreeRefrigerator extends Refrigerator {

    @Override
    public void freeze() {
        System.out.println("格力冰箱！！！");
    }

}
