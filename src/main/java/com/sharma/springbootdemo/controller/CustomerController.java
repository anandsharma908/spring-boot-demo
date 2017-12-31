package com.sharma.springbootdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author anand.
 * since on 29/12/17.
 */
@RestController(value = "/demo")
@Api(value = "customer controller", description = "this is customer service apis")
public class CustomerController extends BaseController {
    @GetMapping(value = "/hi")
    @ApiOperation(value = "this is simple hellow mesg")
    public String hello(){
        return "hello world";
    }

}
