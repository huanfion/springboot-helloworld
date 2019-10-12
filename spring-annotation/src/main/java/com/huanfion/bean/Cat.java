package com.huanfion.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 11:22
 */
public class Cat implements InitializingBean, DisposableBean {
    public Cat(){
        System.out.println("cat constructor ...");
    }

    /**
     * 定义销毁方法
     * @throws Exception
     */
    @Override
    public void destroy() throws Exception {
        System.out.println("cat destroy ...");
    }

    /**
     * 定义初始化方法
     * @throws Exception
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("cat init ...");
    }
}
