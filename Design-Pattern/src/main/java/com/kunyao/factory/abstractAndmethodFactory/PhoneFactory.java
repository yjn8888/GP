package com.kunyao.factory.abstractAndmethodFactory;

import com.kunyao.factory.Phone;

/**
 * 顶层接口，以为产品族以手机为核心，所以都必须实现这个接口，类似于BeanFactory
 */
public interface PhoneFactory {

    Phone getPhone();
}
