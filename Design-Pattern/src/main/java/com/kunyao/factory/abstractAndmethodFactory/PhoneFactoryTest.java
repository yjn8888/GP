package com.kunyao.factory.abstractAndmethodFactory;

public class PhoneFactoryTest {

    public static void main(String[] args){
        PhoneAccessories phoneAccessories = new IPhoneFactory();
        phoneAccessories.getPhone().sysoutName();
        phoneAccessories.getCharger().charge();
        phoneAccessories.getEarphone().silentListen();
        PhoneFactory phoneFactory = new ShanZhaiPhoneFactory();
        phoneFactory.getPhone().sysoutName();
    }
}
