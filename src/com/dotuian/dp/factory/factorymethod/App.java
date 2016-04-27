package com.dotuian.dp.factory.factorymethod;

import com.dotuian.dp.factory.factorymethod.factory.AppleFactory;
import com.dotuian.dp.factory.factorymethod.factory.HtcFactory;
import com.dotuian.dp.factory.factorymethod.factory.MiFactory;
import com.dotuian.dp.factory.factorymethod.factory.PhoneFactory;
import com.dotuian.dp.factory.factorymethod.phone.Phone;

public class App {

    public static void main(String[] args) {
        
        //PhoneFactory factory = new AppleFactory();
        //PhoneFactory factory = new MiFactory();
        PhoneFactory factory = new HtcFactory();
        Phone phone = factory.create();
        phone.call();
        
    }

}
