package com.sharma.springbootdemo.controller;

import com.sharma.springbootdemo.entity.Customer;
import com.sharma.springbootdemo.repository.CustomerRepository;
import com.sharma.springbootdemo.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author anand.
 * since on 29/12/17.
 */
@RestController(value = "/demo")
@Api(value = "customer controller", description = "this is customer service apis")
public class CustomerController extends BaseController {

    @Autowired
    CustomerService customerService;
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/hi")
    @ApiOperation(value = "this is simple hellow mesg")
    public String hello(){
        return "hello world";
    }

    @GetMapping(value = "/getData/{name}")
    @ApiOperation(value = "this is simple get msg")
    public Customer getData(@RequestParam String name){
        return customerService.findByCustomerName(name);
    }

    @GetMapping(value ="/getAll")
    public List<Customer> getAllArticles() {
        List<Customer> list = customerRepository.findAll();
        return list;
    }


    @PostMapping("/create")
    @ResponseBody
    public String createCustomer(@RequestBody Customer customer) {
        try {
            customerService.saveCustomer(customer);
        }
        catch (Exception ex) {
            return "Error creating the customer: " + ex.toString();
        }
        return "User succesfully created with id = " + customer.id;
    }



}
