package com.huanfion.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断是否是windows环境
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 18:09
 */
public class WindowsCondition implements Condition {
    /**
     *
     * @param context 判断条件能使用的上下文环境
     * @param metadata 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //是否windows系统
        //1、可以获取到ioc使用的beanfactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //2.可以获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //3.可以获取当前环境信息
        Environment environment = context.getEnvironment();
        //4.可以获取到bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();
        String property = environment.getProperty("os.name");
        if(property.contains("Windows")){
            return true;
        }
        return false;
    }
}
