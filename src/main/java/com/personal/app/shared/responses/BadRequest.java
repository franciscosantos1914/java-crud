package com.personal.app.shared.responses;

public class BadRequest<T> extends Response<T> {

    public BadRequest(T data) {
        super(data, 400);
    }

    @Override
    public Boolean isOk() {
        return false;
    }
}
