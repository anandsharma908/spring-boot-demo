package com.sharma.springbootdemo.restwebmodel;

/**
 * author anand.
 * since on 29/12/17.
 */
public enum ErrorCode {
    STORE_ID_MUST_NOT_BE_BLANK_OR_NULL(
            "StoreId must not be blank or null");

    private String message;

    ErrorCode(String message) {
        this.message = message;
    }

    public String getCode() {
        return this.name();
    }

    public String getMessage() {
        return message;
    }
}
