package com.sharma.springbootdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

/**
 * author anand.
 * since on 29/12/17.
 */
@Data
@Builder
@Entity(name = "Customer")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "customerAddress")
    private String customerAddress;
    @Column(name = "salary")
    private String salary;
    @Column(name = "phoneNumber")
    private String phoneNumber;
}
