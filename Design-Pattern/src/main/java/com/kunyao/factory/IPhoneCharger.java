package com.kunyao.factory;

public class IPhoneCharger implements Charger{
    @Override
    public void charge() {
        System.out.println("I am IPhoneCharger");
    }
}
