package com.kunyao.factory.factorymetod;

public class PhoneFactoryTest {
    public static void main(String[] args){

        new IPhoneFactory().getPhone().sysoutName();
        new LePhoneFactory().getPhone().sysoutName();
        new MeiZuPhoneFactory().getPhone().sysoutName();
    }
}
