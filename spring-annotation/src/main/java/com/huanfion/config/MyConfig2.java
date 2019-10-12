package com.huanfion.config;

import com.huanfion.bean.Color;
import com.huanfion.bean.ColorFactoryBean;
import com.huanfion.bean.Person;
import com.huanfion.condition.LinuxCondition;
import com.huanfion.condition.WindowsCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 16:40
 */
@Configuration
@Import({Color.class, MyImportSelector.class, MyImportBeanDefinitionRegistrar.class})
public class MyConfig2 {
    /**
     * ConfigurableBeanFactory#SCOPE_SINGLETON SCOPE_SINGLETON
     *
     * @return prototype:多实例的 ioc容器启动时不会调用方法创建对象，而是在获取bean的时候才会创建对象
     * singleton: 单实例的 默认 ioc容器启动会调用方法创建对象放到ioc容器中，以后每次获取直接从容器中拿
     * request: 同一次请求创建一个实例
     * session：同一个session 创建一个实例
     * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
     * @see ConfigurableBeanFactory#SCOPE_SINGLETON
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
     * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
     */
    @Scope("singleton")
//    @Lazy
    @Bean("person")
    public Person person() {
        System.out.println("给容器中添加person....");
        return new Person(25, "王五");
    }

    /**
     * @Conditional :按照一定的条件进行判断，满足条件给容器中注册bean
     * 如果系统是windows，给容器注册bill
     * 如果是是linux系统给容器注册linux
     */
    @Bean("bill")
    @Conditional(WindowsCondition.class)
    public Person person01() {
        return new Person(62, "Bill Gates");
    }

    @Bean("linux")
    @Conditional(LinuxCondition.class)
    public Person person02() {
        return new Person(48, "linux");
    }

    @Bean
    public ColorFactoryBean colorFactoryBean() {
        return new ColorFactoryBean();
    }
}
