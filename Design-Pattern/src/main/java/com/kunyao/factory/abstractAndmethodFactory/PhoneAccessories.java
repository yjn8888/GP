package com.kunyao.factory.abstractAndmethodFactory;

import com.kunyao.factory.Charger;
import com.kunyao.factory.Earphone;

/**
 * 自由组合定义符合自己产品特性的工厂接口，按照接口隔离原则，易于扩展，减少冗余，扩展产品类别时不影响不需要的增加的已有工厂
 */
public interface PhoneAccessories extends PhoneFactory {
    Earphone getEarphone();

    Charger getCharger();
}
