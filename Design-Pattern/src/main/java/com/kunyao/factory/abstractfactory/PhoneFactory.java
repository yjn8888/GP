package com.kunyao.factory.abstractfactory;

import com.kunyao.factory.Charger;
import com.kunyao.factory.Earphone;
import com.kunyao.factory.Phone;

public interface PhoneFactory {
    Phone getPhone();

    Earphone getEarphone();

    Charger getCharger();

}
