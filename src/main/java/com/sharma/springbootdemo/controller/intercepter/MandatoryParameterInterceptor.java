package com.sharma.springbootdemo.controller.intercepter;

import com.sharma.springbootdemo.restwebmodel.ErrorCode;
import com.sharma.springbootdemo.restwebmodel.MandatoryParameter;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.google.common.base.Preconditions.checkArgument;

/**
 * author anand.
 * since on 29/12/17.
 */
public class MandatoryParameterInterceptor extends HandlerInterceptorAdapter {
    /**
     * HttpServletRequest attribute name
     */
    public static String PARAMETER = "mandatory";

    /**
     * Get mandatory parameter from servlet request
     *
     * @param request servlet request
     * @return mandatory parameter
     */
    protected MandatoryParameter validateAndGetMandatoryParameter(HttpServletRequest request) {
        String CHANNEL_ID = request.getHeader("channelId");

        String USER_NAME = request.getHeader("username");

        checkArgument(StringUtils.isNotBlank(CHANNEL_ID),
                ErrorCode.CHANNEL_ID_MUST_NOT_BE_BLANK_OR_NULL);

        return new MandatoryParameterBuilder().withChannelId(CHANNEL_ID)
                .withUsername(USER_NAME).build();
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        MandatoryParameter parameter = this.validateAndGetMandatoryParameter(request);
        request.setAttribute(PARAMETER, parameter);
        return true;
    }
}
