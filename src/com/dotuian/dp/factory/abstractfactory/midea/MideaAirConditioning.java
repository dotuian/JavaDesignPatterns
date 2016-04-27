package com.dotuian.dp.factory.abstractfactory.midea;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;

public class MideaAirConditioning extends AirConditioning {

    @Override
    public void cool() {
        System.out.println("美的空调！！！");
    }

}
