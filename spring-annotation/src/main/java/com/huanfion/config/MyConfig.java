package com.huanfion.config;

import com.huanfion.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 10:44
 */
@Configuration //配置类注解
@ComponentScan(value = "com.huanfion",
//        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
//        classes = {Controller.class, Service.class})}
        includeFilters = {@ComponentScan.Filter(type=FilterType.CUSTOM,classes = {MyTypeFilter.class})}
        ,useDefaultFilters = false)
public class MyConfig {

    @Bean//注册组件  类型为返回值的类型，id默认是用方法名作为id
    public Person person(){
        return new Person(19,"李四");
    }
}
