package com.dotuian.dp.factory.abstractfactory.haier;

import com.dotuian.dp.factory.abstractfactory.Refrigerator;

public class HaierRefrigerator extends Refrigerator {

    @Override
    public void freeze() {
        System.out.println("海尔冰箱！！！");
    }

}
