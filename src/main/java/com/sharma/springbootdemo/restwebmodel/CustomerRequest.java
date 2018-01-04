package com.sharma.springbootdemo.restwebmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author anand.
 * since on 4/1/18.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerRequest implements Serializable {

    private static final long serialVersionUID = 2305008733852339175L;

    private String customerName;

    private String phoneNumber;

    private String salary;

    private String customerAddress;
}
