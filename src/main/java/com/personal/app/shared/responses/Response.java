package com.personal.app.shared.responses;

import com.personal.app.shared.interfaces.IResponse;

public abstract class Response<T> implements IResponse {

    public T data;
    public Integer statusCode;

    public Response(T data, Integer statusCode) {
        this.data = data;
        this.statusCode = statusCode;
    }

    public T getData() {
        return this.data;
    }

    public Integer getStatusCode() {
        return this.statusCode;
    }

    @Override
    public Boolean isOk() {
        return true;
    }

}
