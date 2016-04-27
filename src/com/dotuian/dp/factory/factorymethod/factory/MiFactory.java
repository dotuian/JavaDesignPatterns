package com.dotuian.dp.factory.factorymethod.factory;

import com.dotuian.dp.factory.factorymethod.phone.MiPhone;
import com.dotuian.dp.factory.factorymethod.phone.Phone;

public class MiFactory extends PhoneFactory {

    @Override
    public Phone create() {
        return new MiPhone();
    }

}
