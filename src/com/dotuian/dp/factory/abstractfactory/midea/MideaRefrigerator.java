package com.dotuian.dp.factory.abstractfactory.midea;

import com.dotuian.dp.factory.abstractfactory.Refrigerator;

public class MideaRefrigerator extends Refrigerator {

    @Override
    public void freeze() {
        System.out.println("美的冰箱！！！");
    }

}
