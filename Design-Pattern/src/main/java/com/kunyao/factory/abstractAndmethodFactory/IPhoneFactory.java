package com.kunyao.factory.abstractAndmethodFactory;

import com.kunyao.factory.*;
import com.kunyao.factory.abstractfactory.PhoneFactory;

public class IPhoneFactory implements PhoneAccessories{
    @Override
    public Phone getPhone() {
        return new IPhone();
    }

    @Override
    public Earphone getEarphone() {
        return new IPhoneEar();
    }

    @Override
    public Charger getCharger() {
        return new IPhoneCharger();
    }
}
