package com.sharma.springbootdemo.repository;

import com.sharma.springbootdemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * author anand.
 * since on 31/12/17.
 */
public interface CustomerRepository extends JpaRepository<Customer, String> {
}
