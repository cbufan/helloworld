package com.chen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * description:
 * className:HelloController
 * author: chenqifan
 * date:2023/3/922:46
 **/

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String hello(){
        System.out.println(LocalDateTime.now()+":hello centos7");
        return "hello centos7";
    }
}
