package com.zhenxuyang.springbootweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: zhenxuyang
 * @data: 2023/2/5
 * @time: 23:32
 * @description:
 */
@RestController
public class HelloController {

    @RequestMapping(path = "/hello")
    public String hello(){
        return "Hello World";
    }
}
