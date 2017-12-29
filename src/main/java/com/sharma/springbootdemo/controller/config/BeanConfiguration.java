package com.sharma.springbootdemo.controller.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sharma.springbootdemo.controller.handler.DeserializationProblemHandler;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * author anand.
 * since on 29/12/17.
 */
@Configurable
public class BeanConfiguration  {
    @Bean
    DeserializationProblemHandler deserializationProblemHandler() {
        return new DeserializationProblemHandler();
    }



    @Bean
    public ObjectMapper createObjectMapper() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_NUMBERS_FOR_ENUMS, true);
        objectMapper.configure(DeserializationFeature.READ_ENUMS_USING_TO_STRING, true);
        objectMapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        objectMapper.configure(DeserializationFeature.ACCEPT_FLOAT_AS_INT, false);
            objectMapper.addHandler(this.deserializationProblemHandler());
        return objectMapper;
    }
}
