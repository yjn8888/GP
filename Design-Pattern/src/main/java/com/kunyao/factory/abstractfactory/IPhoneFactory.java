package com.kunyao.factory.abstractfactory;

import com.kunyao.factory.*;

public class IPhoneFactory implements PhoneFactory{
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
