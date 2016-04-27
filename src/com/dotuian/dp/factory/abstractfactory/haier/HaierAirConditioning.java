package com.dotuian.dp.factory.abstractfactory.haier;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;

public class HaierAirConditioning extends AirConditioning {

    @Override
    public void cool() {
        System.out.println("海尔空调！！！");
    }

}
