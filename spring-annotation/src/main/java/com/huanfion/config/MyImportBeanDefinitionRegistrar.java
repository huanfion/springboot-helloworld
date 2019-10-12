package com.huanfion.config;

import com.huanfion.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 9:54
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    /**
     *
     * @param importingClassMetadata :当前类的注解信息
     * @param registry：BeanDefinition 注册类
     *                把所有需要注册的bean，调用BeanDefinitionRegistry.registerBeanDefinition方法
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean beanDefinition = registry.containsBeanDefinition("com.huanfion.bean.Blue");
        boolean beanDefinition1 = registry.containsBeanDefinition("com.huanfion.bean.Yellow");
        if(beanDefinition&&beanDefinition1){
            //指定beanDefinition
            RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainbow",rootBeanDefinition);
        }
    }
}
