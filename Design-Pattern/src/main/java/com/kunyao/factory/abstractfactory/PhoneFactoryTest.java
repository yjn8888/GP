package com.kunyao.factory.abstractfactory;

public class PhoneFactoryTest {

    public static void main(String[] args){
        PhoneFactory phoneFactory = new IPhoneFactory();
        phoneFactory.getPhone().sysoutName();
        phoneFactory.getCharger().charge();
        phoneFactory.getEarphone().silentListen();
    }
}
