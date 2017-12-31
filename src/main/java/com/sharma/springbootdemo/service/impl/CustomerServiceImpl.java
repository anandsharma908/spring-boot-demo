package com.sharma.springbootdemo.service.impl;

import com.sharma.springbootdemo.entity.Customer;
import com.sharma.springbootdemo.repository.CustomerRepository;
import com.sharma.springbootdemo.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * author anand.
 * since on 31/12/17.
 */
@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public void saveCustomer(Customer customer) {
        try {
            log.info("saving object : {}", customer);
            this.repository.save(customer);
            log.info("Successfully save object : {}", customer);
        } catch (Exception e) {
            log.error("failed  to save object : {}, with error : {}", customer, e);
        }
    }

    @Override
    public Customer findByCustomerName(String customerName) {
        return null;
    }
}

