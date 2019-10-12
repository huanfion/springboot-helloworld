package com.huanfion;

import com.huanfion.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 10:31
 */
public class AnnotationApplication {
    public static void main(String[] args) {
       /* 1.使用bean.xml的方式注入bean
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        Object person = applicationContext.getBean("person");
        //或者使用类型获取
       applicationContext.getBean(Person.class);
        System.out.println(person);*/
        /*
        2.使用注解的方式开发
        * */
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext("com.huanfion.config");
        Object person = applicationContext.getBean("person");
        System.out.println(person);
    }
}
