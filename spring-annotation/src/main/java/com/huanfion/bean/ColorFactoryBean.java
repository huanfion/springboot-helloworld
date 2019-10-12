package com.huanfion.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 创建spring定义的FactoryBean
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 10:17
 */
public class ColorFactoryBean implements FactoryBean<Color> {

    //返回Color对象，这个对象会添加到Spring 容器中
    @Override
    public Color getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * true: 单例
     * false: 多实例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
