package com.sharma.springbootdemo.controller;

import com.sharma.springbootdemo.entity.Customer;
import com.sharma.springbootdemo.repository.CustomerRepository;
import com.sharma.springbootdemo.restwebmodel.CustomerRequest;
import com.sharma.springbootdemo.restwebmodel.CustomerResponse;
import com.sharma.springbootdemo.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * author anand.
 * since on 29/12/17.
 */
@Slf4j
@RestController(value = "/demo")
@Api(value = "customer controller", description = "this is customer service apis")
public class CustomerController extends BaseController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/hi")
    @ApiOperation(value = "this is simple hellow mesg")
    public String hello(){
        return "hello world";
    }

    @GetMapping(value = "/findByName", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "this is simple get msg")
    public CustomerResponse getData(@RequestParam(required = true) String name){
        Customer customer = customerService.findByCustomerName(name);
        if(customer != null) {
            return this.customerService.convertResponse(customer);
        }
        log.error("customer not found with name: {}", name);
        return null;
    }

    @GetMapping(value ="/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerResponse> getAllCustomer() {
        log.info("/getAll start");
        List<Customer> customerList = this.customerService.findAllCustomers();
       List<CustomerResponse> responses =this.customerService.convertListResponse(customerList);
        log.info("/getAll end");
        return responses;

    }



    @PostMapping(value = "/create", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "create customer")
    public String createCustomer(@RequestBody CustomerRequest customer) {
        try {
            customerService.saveCustomer(customer);
        }
        catch (Exception ex) {
            return "Error creating the customer: " + ex.toString();
        }
        return "User succesfully created with id = " + customer;
    }



}
