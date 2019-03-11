package com.kunyao.factory.factorymetod;

import com.kunyao.factory.LePhone;
import com.kunyao.factory.Phone;

public class LePhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new LePhone();
    }
}
