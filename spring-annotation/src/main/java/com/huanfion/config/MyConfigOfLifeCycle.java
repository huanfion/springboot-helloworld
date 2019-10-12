package com.huanfion.config;

import com.huanfion.bean.Car;
import com.huanfion.bean.Cat;
import com.huanfion.bean.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Bean的生命周期：
 *          bean创建---初始化---销毁的过程
 * 容器管理bean的生命周期
 * 初始化和销毁方法可以自定义。
 * 1）指定初始化和销毁方法；
 *      通过@Bean指定 init-method 和destory-method;
 * 2) 通过让Bean实现  InitializingBean （定义初始化逻辑）和DisposableBean(定义销毁逻辑)
 * 3）使用JSR250：
 *      @PostConstruct 在bean创建完成并且属性赋值完成后，执行初始化方法
 *      @PreDestory 在容器销毁bean之前 通知我们销毁
 * 4） BeanPostProcessor ：Bean的后置处理器。
 *      在bean初始化前后进行一些处理工作：
 *      postProcessBeforeInitialization:在任何bean初始化（包括InitializingBean的afterPropertiesSet，Bean的init-method）之前工作，
 *      postProcessAfterInitialization：在bean初始化之后工作。
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 10:32
 */
@Configuration
@ComponentScan("com.huanfion.bean")
public class MyConfigOfLifeCycle {
    //@Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Car car(){
        return new Car();
    }

    @Bean
    public Cat cat(){
        return new Cat();
    }
//@Scope("prototype")
    @Bean
    public Dog dog(){
        return new Dog();
    }
}
