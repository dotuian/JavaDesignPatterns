package com.dotuian.dp.factory.abstractfactory.factory;

import com.dotuian.dp.factory.abstractfactory.AirConditioning;
import com.dotuian.dp.factory.abstractfactory.Refrigerator;
import com.dotuian.dp.factory.abstractfactory.WashingMachine;

/**
 * 抽象工厂
 * 
 * @author SHOU
 *
 */
public abstract class AbstractFactory {

    /**
     * 创建空调方法
     * 
     * @return
     */
    public abstract AirConditioning createAirConditioning();

    /**
     * 创建冰箱方法
     * 
     * @return
     */
    public abstract Refrigerator createRefrigerator();

    /**
     * 创建洗衣机方法
     * 
     * @return
     */
    public abstract WashingMachine createWashingMachine();

}
