package com.sharma.springbootdemo.service.impl;

import com.sharma.springbootdemo.entity.Customer;
import com.sharma.springbootdemo.repository.CustomerRepository;
import com.sharma.springbootdemo.restwebmodel.CustomerRequest;
import com.sharma.springbootdemo.restwebmodel.CustomerResponse;
import com.sharma.springbootdemo.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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
    public void saveCustomer(CustomerRequest customer) {
        try {
            log.info("saving object : {}", customer);
            Customer customer1 = new Customer();
            customer1.setCustomerName(customer.getCustomerName());
            customer1.setCustomerAddress(customer.getCustomerAddress());
            customer1.setPhoneNumber(customer.getPhoneNumber());
            customer1.setSalary(customer.getSalary());
            this.repository.save(customer1);
            log.info("Successfully save object : {}", customer);
        } catch (Exception e) {
            log.error("failed  to save object : {}, with error : {}", customer, e);
        }
    }

    @Override
    public Customer findByCustomerName(String customerName) {
        return this.repository.findByCustomerName(customerName);
    }

    @Override
    public List<Customer> findAllCustomers() {
        return repository.findAll();
    }

    @Override
    public List<CustomerResponse> convertListResponse(List<Customer> customers) {
        List<CustomerResponse> responses = new ArrayList<>();
        for (Customer customer:customers) {
            CustomerResponse response = constructCustomerResponse(customer);
            responses.add(response);
        }
        return responses;
    }

    /**
     *  this method construct customer response
     * @param customer - object refference of customer
     * @return customer response
     */
    private CustomerResponse constructCustomerResponse(Customer customer) {
        CustomerResponse response = new CustomerResponse();
        response.setCustomerAddress(customer.getCustomerAddress());
        response.setCustomerName(customer.getCustomerName());
        response.setId(customer.getId());
        response.setSalary(customer.getSalary());
        response.setPhoneNumber(customer.getPhoneNumber());
        return response;
    }

    @Override
    public CustomerResponse convertResponse(Customer customer) {
        return constructCustomerResponse(customer);
    }
}

