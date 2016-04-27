package com.dotuian.dp.factory.abstractfactory;

import com.dotuian.dp.factory.abstractfactory.factory.AbstractFactory;
import com.dotuian.dp.factory.abstractfactory.factory.GreeFactory;
import com.dotuian.dp.factory.abstractfactory.factory.HaierFactory;
import com.dotuian.dp.factory.abstractfactory.factory.MideaFactory;

public class App {

    public static void main(String[] args) {
        
        // 工厂抽象模式，适用于替换整个系列的产品。
        // 系统中有多于一个的产品族，而每次只使用其中某一产品族。

        
        //AbstractFactory factory = new HaierFactory();
        //AbstractFactory factory = new GreeFactory();
        AbstractFactory factory = new MideaFactory();
        
        AirConditioning a = factory.createAirConditioning();
        a.cool();
        
        WashingMachine w = factory.createWashingMachine();
        w.wash();
        
        Refrigerator r = factory.createRefrigerator();
        r.freeze();
    }

}
