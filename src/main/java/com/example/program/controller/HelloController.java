package com.example.program.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    static Integer currencyValue = 0;

    @GetMapping("/index")
    public String hello(){
        currencyValue++;
        System.out.println("当前的value值："+currencyValue);
        return "返回的value值："+currencyValue;
    }

}
