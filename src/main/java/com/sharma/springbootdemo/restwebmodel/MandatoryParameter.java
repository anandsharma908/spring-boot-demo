package com.sharma.springbootdemo.restwebmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.io.Serializable;

/**
 * author anand.
 * since on 29/12/17.
 */
@Data
@GeneratePojoBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MandatoryParameter implements Serializable {

    private static final long serialVersionUID = 2936863645136997484L;

    private String storeId;
    private String username;
}
