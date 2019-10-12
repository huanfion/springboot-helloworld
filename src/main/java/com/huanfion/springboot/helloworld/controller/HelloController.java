package com.huanfion.springboot.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huanfion
 * @version 1.0
 * @date 2019/7/15 11:12
 */
@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String Hello(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }
}
