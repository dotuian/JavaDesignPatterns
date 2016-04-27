package com.dotuian.dp.factory.abstractfactory.factory;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;
import com.dotuian.dp.factory.abstractfactory.Refrigerator;
import com.dotuian.dp.factory.abstractfactory.WashingMachine;
import com.dotuian.dp.factory.abstractfactory.haier.HaierAirConditioning;
import com.dotuian.dp.factory.abstractfactory.haier.HaierRefrigerator;
import com.dotuian.dp.factory.abstractfactory.haier.HaierWashMachine;

public class HaierFactory extends AbstractFactory {

    @Override
    public AirConditioning createAirConditioning() {
        return new HaierAirConditioning();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new HaierRefrigerator();
    }

    @Override
    public WashingMachine createWashingMachine() {
        return new HaierWashMachine();
    }

}
