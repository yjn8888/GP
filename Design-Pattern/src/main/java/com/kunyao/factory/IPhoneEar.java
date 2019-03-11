package com.kunyao.factory;

import com.kunyao.factory.Earphone;

public class IPhoneEar implements Earphone {
    @Override
    public void silentListen() {
        System.out.println("I am IPhoneEar");
    }
}
