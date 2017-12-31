package com.sharma.springbootdemo.service;

import com.sharma.springbootdemo.entity.Customer;

/**
 * author anand.
 * since on 31/12/17.
 */
public interface CustomerService {
    void saveCustomer(Customer customer);
    Customer findByCustomerName(String customerName);
}
