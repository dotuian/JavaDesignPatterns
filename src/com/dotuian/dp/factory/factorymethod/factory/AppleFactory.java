package com.dotuian.dp.factory.factorymethod.factory;

import com.dotuian.dp.factory.factorymethod.phone.ApplePhone;
import com.dotuian.dp.factory.factorymethod.phone.Phone;

public class AppleFactory extends PhoneFactory {

    @Override
    public Phone create() {
        return new ApplePhone();
    }

}
