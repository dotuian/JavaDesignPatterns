package com.dotuian.dp.factory.abstractfactory.factory;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;
import com.dotuian.dp.factory.abstractfactory.Refrigerator;
import com.dotuian.dp.factory.abstractfactory.WashingMachine;
import com.dotuian.dp.factory.abstractfactory.midea.MideaAirConditioning;
import com.dotuian.dp.factory.abstractfactory.midea.MideaRefrigerator;
import com.dotuian.dp.factory.abstractfactory.midea.MideaWashMachine;

public class MideaFactory extends AbstractFactory {

    @Override
    public AirConditioning createAirConditioning() {
        return new MideaAirConditioning();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new MideaRefrigerator();
    }

    @Override
    public WashingMachine createWashingMachine() {
        return new MideaWashMachine();
    }

}
