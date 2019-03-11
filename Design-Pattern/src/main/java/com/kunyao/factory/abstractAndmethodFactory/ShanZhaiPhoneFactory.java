package com.kunyao.factory.abstractAndmethodFactory;

import com.kunyao.factory.Phone;
import com.kunyao.factory.ShanZhaiPhone;

public class ShanZhaiPhoneFactory implements PhoneFactory{
    @Override
    public Phone getPhone() {
        return new ShanZhaiPhone();
    }
}
