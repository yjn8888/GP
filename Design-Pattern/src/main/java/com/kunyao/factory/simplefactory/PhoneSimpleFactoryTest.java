package com.kunyao.factory.simplefactory;

import com.kunyao.factory.IPhone;
import com.kunyao.factory.LePhone;
import com.kunyao.factory.MeiZu;
import com.kunyao.factory.Phone;

public class PhoneSimpleFactoryTest {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Phone phone = PhoneSimpleFactory.getPhone("IPhone");
        phone.sysoutName();
        phone = PhoneSimpleFactory.getPhone("MeiZu");
        phone.sysoutName();
        phone = PhoneSimpleFactory.getPhone("LePhone");
        phone.sysoutName();
        phone = PhoneSimpleFactory.getPhone(IPhone.class);
        phone.sysoutName();
        phone = PhoneSimpleFactory.getPhone(MeiZu.class);
        phone.sysoutName();
        phone = PhoneSimpleFactory.getPhone(LePhone.class);
        phone.sysoutName();
    }
}
