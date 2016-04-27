package com.dotuian.dp.factory.abstractfactory.factory;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;
import com.dotuian.dp.factory.abstractfactory.Refrigerator;
import com.dotuian.dp.factory.abstractfactory.WashingMachine;
import com.dotuian.dp.factory.abstractfactory.gree.GreeAirConditioning;
import com.dotuian.dp.factory.abstractfactory.gree.GreeRefrigerator;
import com.dotuian.dp.factory.abstractfactory.gree.GreeWashMachine;

/**
 * 格力产品的工厂
 * 
 * @author SHOU
 */
public class GreeFactory extends AbstractFactory {

    @Override
    public AirConditioning createAirConditioning() {
        return new GreeAirConditioning();
    }

    @Override
    public Refrigerator createRefrigerator() {
        return new GreeRefrigerator();
    }

    @Override
    public WashingMachine createWashingMachine() {
        return new GreeWashMachine();
    }

}
