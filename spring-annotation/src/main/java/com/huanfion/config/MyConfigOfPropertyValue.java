package com.huanfion.config;

import com.huanfion.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/12 17:13
 */
@PropertySource(value = "classpath:/person.properties",encoding = "utf-8")
@Configuration
public class MyConfigOfPropertyValue {
    @Bean
    public Person person() {
        return new Person();
    }
}

