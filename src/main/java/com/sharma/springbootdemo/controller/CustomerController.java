package com.sharma.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author anand.
 * since on 29/12/17.
 */
@RestController(value = "/demo")
public class CustomerController {
    @RequestMapping(value = "/hi")
    public String hello(){
        return "hello world";
    }

}
