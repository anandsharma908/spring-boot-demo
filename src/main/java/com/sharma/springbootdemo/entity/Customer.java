package com.sharma.springbootdemo.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * author anand.
 * since on 29/12/17.
 */
@Data
@Builder
@Entity(name = "Customer")
public class Customer {
    @Id
    private String id;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "customerAddress")
    private String customerAddress;
    @Column(name = "salary")
    private Long salary;
    @Column(name = "phoneNumber")
    private String phoneNumber;
}
