package com.huanfion.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 11:42
 */
public class Dog {
    public Dog(){
        System.out.println("dog Constructor....");
    }
    //对象创建并赋值之后调用
    @PostConstruct
    public void init(){
        System.out.println("dog init ...");
    }
    //容器移除对象之前调用
    @PreDestroy
    public void destory(){
        System.out.println("dog destory ...");
    }
}
