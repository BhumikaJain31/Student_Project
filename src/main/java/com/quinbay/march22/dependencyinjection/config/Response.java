package com.quinbay.march22.dependencyinjection.config;

public class Response<T> {

    private T data;
    private boolean isResult;
    private String errorCode;
    private String errorMessage;

    public Response(T data) {
        isResult = true;
        this.data = data;
    }

    public Response(String error, String errorMessage) {
        isResult = false;
        this.errorCode = error;
        this.errorMessage = errorMessage;
    }
}
