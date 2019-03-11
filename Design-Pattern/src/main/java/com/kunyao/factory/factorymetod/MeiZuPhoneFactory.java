package com.kunyao.factory.factorymetod;

import com.kunyao.factory.MeiZu;
import com.kunyao.factory.Phone;

public class MeiZuPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new MeiZu();
    }
}
