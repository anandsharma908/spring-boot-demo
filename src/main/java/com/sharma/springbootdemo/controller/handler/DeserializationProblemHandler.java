package com.sharma.springbootdemo.controller.handler;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * author anand.
 * since on 29/12/17.
 */
@Slf4j
public class DeserializationProblemHandler  extends com.fasterxml.jackson.databind.deser.DeserializationProblemHandler {

    @Override
    public boolean handleUnknownProperty(DeserializationContext ctxt, JsonParser p,
                                         JsonDeserializer<?> deserializer, Object beanOrClass, String propertyName)
            throws IOException {
        DeserializationProblemHandler.log.warn("unknown field : {}", propertyName);
        return true;
    }
}
