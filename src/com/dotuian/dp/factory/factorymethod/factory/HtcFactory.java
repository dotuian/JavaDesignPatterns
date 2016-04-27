package com.dotuian.dp.factory.factorymethod.factory;

import com.dotuian.dp.factory.factorymethod.phone.HtcPhone;
import com.dotuian.dp.factory.factorymethod.phone.Phone;

public class HtcFactory extends PhoneFactory {

    @Override
    public Phone create() {
        return new HtcPhone();
    }

}
