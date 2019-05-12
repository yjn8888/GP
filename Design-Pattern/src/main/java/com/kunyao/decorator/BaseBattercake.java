package com.kunyao.decorator;

public class BaseBattercake extends Battercake{
    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getMsg() {
        return null;
    }
}
