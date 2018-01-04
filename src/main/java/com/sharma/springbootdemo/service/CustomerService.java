package com.sharma.springbootdemo.service;

import com.sharma.springbootdemo.entity.Customer;
import com.sharma.springbootdemo.restwebmodel.CustomerRequest;
import com.sharma.springbootdemo.restwebmodel.CustomerResponse;

import java.util.List;

/**
 * author anand.
 * since on 31/12/17.
 */
public interface CustomerService {
    void saveCustomer(CustomerRequest customer);
    Customer findByCustomerName(String customerName);
    List<Customer> findAllCustomers();
    List<CustomerResponse> convertListResponse(List<Customer> customers);
    CustomerResponse convertResponse(Customer customer);
}
