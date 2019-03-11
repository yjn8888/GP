package com.kunyao.factory.simplefactory;

import com.kunyao.factory.IPhone;
import com.kunyao.factory.LePhone;
import com.kunyao.factory.MeiZu;
import com.kunyao.factory.Phone;

/**
 * 小作坊
 */
public class PhoneSimpleFactory {

    public static Phone getPhone(String name){
        switch (name){
            case "IPhone":
                return new IPhone();
            case "LePhone":
                return new LePhone();
            case "MeiZu":
                return new MeiZu();
            default:
                return null;
        }

    }

    public static Phone getPhone(Class clazz) throws IllegalAccessException, InstantiationException {
        if(clazz==null){
            return null;
        }
        return (Phone) clazz.newInstance();

    }
}
