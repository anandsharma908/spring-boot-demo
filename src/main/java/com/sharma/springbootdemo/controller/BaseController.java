package com.sharma.springbootdemo.controller;

import com.sharma.springbootdemo.controller.intercepter.MandatoryParameterInterceptor;
import com.sharma.springbootdemo.restwebmodel.MandatoryParameter;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;

/**
 * author anand.
 * since on 31/12/17.
 */
public class BaseController {
    @ModelAttribute
    public MandatoryParameter getMandatoryParameter(HttpServletRequest servletRequest) {
        return (MandatoryParameter) servletRequest.getAttribute(MandatoryParameterInterceptor.PARAMETER);
    }

}
