package com.huanfion.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/10/11 10:25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Value("20")
    private Integer age;
//    @Value("张三")
    @Value("${person.name}")
    private String name;
}
