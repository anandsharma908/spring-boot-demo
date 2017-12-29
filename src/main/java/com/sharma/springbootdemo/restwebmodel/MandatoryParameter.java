package com.sharma.springbootdemo.restwebmodel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import net.karneim.pojobuilder.GeneratePojoBuilder;

import java.io.Serializable;

/**
 * author anand.
 * since on 29/12/17.
 */
@Data
@Builder
@GeneratePojoBuilder
@JsonIgnoreProperties(ignoreUnknown = true)
public class MandatoryParameter implements Serializable {
    private static final long serialVersionUID = -7930874594931355508L;

    private String storeId;

    private String  username;
}
