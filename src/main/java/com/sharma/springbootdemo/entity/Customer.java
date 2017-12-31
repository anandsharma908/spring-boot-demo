package com.sharma.springbootdemo.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * author anand.
 * since on 29/12/17.
 */
@Data
@Builder
@Entity(name = "Customer")
public class Customer {
    public Customer(String id, String customerName, String customerAddress, Long salary, String phoneNumber) {
        this.id = id;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    @Id
    public String id;
    @Column(name = "customerName")
    public String customerName;
    @Column(name = "customerAddress")
    public String customerAddress;
    @Column(name = "salary")
    public Long salary;
    @Column(name = "phoneNumber")
    public String phoneNumber;
}
