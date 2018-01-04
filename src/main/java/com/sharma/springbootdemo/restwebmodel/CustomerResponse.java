package com.sharma.springbootdemo.restwebmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * author anand.
 * since on 4/1/18.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomerResponse implements Serializable {

    private static final long serialVersionUID = 4856152937506657537L;

    private String id;
    private String customerName;

    private String phoneNumber;

    private String salary;

    private String customerAddress;
}
