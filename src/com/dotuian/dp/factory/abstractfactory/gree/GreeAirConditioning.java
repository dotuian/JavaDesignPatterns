package com.dotuian.dp.factory.abstractfactory.gree;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;

public class GreeAirConditioning extends AirConditioning {

    @Override
    public void cool() {
        System.out.println("格力空调！！！");
    }

}
