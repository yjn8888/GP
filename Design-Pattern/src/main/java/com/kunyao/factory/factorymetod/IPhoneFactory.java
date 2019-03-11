package com.kunyao.factory.factorymetod;

import com.kunyao.factory.IPhone;
import com.kunyao.factory.Phone;

public class IPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new IPhone();
    }
}
