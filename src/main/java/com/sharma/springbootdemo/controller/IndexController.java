package com.sharma.springbootdemo.controller;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author anand.
 * since on 31/12/17.
 */
@RestController
public class IndexController implements ErrorController{

    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping(value = "/error")
    public String error() {
        return "return error handling page ..";
    }
}
