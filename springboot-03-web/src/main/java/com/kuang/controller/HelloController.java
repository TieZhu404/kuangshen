package com.kuang.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JSQ
 * @ClassName HelloController.java
 * @Description TODO
 * @createTime 2020年12月29日 12:35:00
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello,world";
    }
}
